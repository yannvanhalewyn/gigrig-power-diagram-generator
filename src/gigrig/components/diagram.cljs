(ns gigrig.components.diagram
  (:require [gigrig.components.boxes :as boxes]
            [gigrig.geometry.line :as line]
            [gigrig.geometry.box :as box]
            [gigrig.zipper :as gzip]
            [clojure.zip :as zip :refer [children]]
            [clojure.string :as str]))

(defn echo [arg] (.log js/console arg) arg)

(declare tree)

(def ROOT-OFFSET 10)
(def CHILDREN-OFFSET 25)
(def CHILD-SPACING 2)

(defn- box
  "Returns box data for the given node at loc positioned on x and y"
  [loc x y]
  (case (gzip/loc-type loc)
    :pedal (boxes/pedal (gzip/box-meta loc) {:x x :y y})
    :isolator (boxes/isolator {:x x :y y})
    :distributor (boxes/distributor {:x x :y y})))

(defn- align
  "Builds an array of box data's in an aligned manner"
  [loc x y]
  (let [x (+ CHILD-SPACING (if (= (zip/leftmost loc) loc) x (box/right (-> loc zip/left gzip/box-meta))))
        new-loc (gzip/set-meta loc (box loc x y))]
    (if (= (zip/rightmost loc) loc)
      new-loc
      (align (zip/right new-loc) x y))))

(defn lines
  "Renders an svg group of lines for each line in lines."
  [lines]
  [:g {:stroke "black"
       :stroke-linecap "round"}
   (for [l lines] ^{:key (line/react-key l)} [:line l])])

(defn node
  "Renders the node. If it's a branch, it recursively render a new
  tree. Else it will render the node"
  [loc]
  (let [box-data (gzip/box-meta loc)]
    (if (zip/branch? loc)
      ^{:key (boxes/react-key box-data)} [tree loc]
      ^{:key (boxes/react-key box-data)} [boxes/boxed-text box-data])))

(defn tree
  "Render the root node at loc and all it's children nodes and the
  lines connecting the root to each child node"
  [loc]
  (let [root (gzip/box-meta loc)
        children (align (zip/down loc) (- (:x root) ROOT-OFFSET) (+ (:y root) CHILDREN-OFFSET))]
    [:g
     [lines (line/connect-trident root (gzip/map-siblings gzip/box-meta (zip/leftmost children)))]
     [boxes/boxed-text root]
     (seq (gzip/map-siblings node (zip/leftmost children)))]))

(defn component
  "The main diagram component. Takes in the zipper tree and renders
  the entire power suplly diagram as an svg"
  [{:keys [zipper]}]
  (let [generator (boxes/generator {:x 0 :y 0})]
    [:div
     [:h1 "DIAGRAM"]
     [:svg {:view-box "0 0 250 100"
            :width "1200"
            :height "800"
            :style {:border "1px solid black"}}
      [boxes/boxed-text generator]
      [lines (line/connect-trident generator [(box zipper ROOT-OFFSET CHILDREN-OFFSET)])]
      [tree (zip/edit zipper merge (box zipper ROOT-OFFSET CHILDREN-OFFSET))]]]))
