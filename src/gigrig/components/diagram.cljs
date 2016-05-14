(ns gigrig.components.diagram
  (:require [gigrig.components.boxes :as boxes]
            [gigrig.geometry.line :as line]
            [gigrig.geometry.box :as box]
            [gigrig.zipper :as gzip]
            [clojure.zip :as zip :refer [children]]
            [clojure.string :as str]))

(declare tree)

(defn lines
  "Renders an svg group of lines for each line in lines."
  [lines]
  [:g {:stroke "black"
       :stroke-linecap "round"}
   (for [l lines] ^{:key (line/react-key l)} [:line l])])

(defn adapter [loc]
  [:g
   [lines (line/connect-trident loc [(zip/down loc)])]
   [boxes/boxed-text (gzip/box-meta loc)]
   [boxes/boxed-text (-> loc zip/down gzip/box-meta)]])

(defn node
  "Renders the node. If it's a branch, it recursively render a new
  tree. Else it will render the node"
  [loc]
  (let [box-data (gzip/box-meta loc)]
    (if (= :time-lord (gzip/loc-type loc))
      ^{:key (boxes/react-key box-data)} [adapter loc]
      (if (zip/branch? loc)
        ^{:key (boxes/react-key box-data)} [tree loc]
        ^{:key (boxes/react-key box-data)} [boxes/boxed-text box-data]))))

(defn tree
  "Render the root node at loc and all it's children nodes and the
  lines connecting the root to each child node"
  [root]
  [:g
   [lines (line/connect-trident (gzip/box-meta root) (gzip/map-siblings gzip/box-meta (zip/down root)))]
   [boxes/boxed-text (gzip/box-meta root)]
   (seq (gzip/map-siblings node (zip/down root)))])

(defn component
  "The main diagram component. Takes in the zipper tree and renders
  the entire power suplly diagram as an svg"
  [{:keys [zipper]}]
  (let [generator (boxes/generator {:x 10 :y 0})]
    [:div
     (when (zip/down zipper)
       [:h1 "DIAGRAM"]
       [:svg {:view-box "0 0 200 200"
              :width "1200"
              :height "1200"}
        [boxes/boxed-text generator]
        [lines (line/connect-trident generator [(gzip/box-meta zipper)])]
        [tree zipper]])]))
