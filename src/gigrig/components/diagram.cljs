(ns gigrig.components.diagram
  (:require [gigrig.boxed-text-data :as btd]
            [gigrig.components.boxes :as boxes]
            [gigrig.geometry.line :as line]
            [gigrig.zipper :as gzip]
            [reagent.core :as reagent]
            [clojure.zip :as zip :refer [children]]))

(declare tree)

(defn- lines
  "Renders an svg group of lines for each line in lines."
  []
  (let [highlight (reagent/atom false)]
    (fn [lines]
      [:g {:stroke (if @highlight "gold" "black")
           :stroke-linecap "round"}
       (for [l lines] ^{:key (line/react-key l)} [:line (merge
                                                         {:on-mouse-enter #(reset! highlight true)
                                                          :on-mouse-leave #(reset! highlight false)}
                                                         l)])])))

(defn- node
  "Renders the node. If it's a branch, it recursively render a new
  tree. Else it will render the node"
  [loc]
  (let [box-data (gzip/box-meta loc)
        key (boxes/react-key box-data)]
    (if (zip/branch? loc)
      ^{:key key} [tree loc]
      ^{:key key} [boxes/boxed-text box-data])))

(defn- tree
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
  (let [generator (btd/generator {:x 60 :y 0})]
    [:div.diagram
     (when (zip/down zipper)
       [:svg {:view-box "0 0 200 200"
              :width "1200"
              :height "1200"}
        [boxes/boxed-text generator]
        [lines (line/connect-trident generator [(gzip/box-meta zipper)])]
        [tree zipper]])]))
