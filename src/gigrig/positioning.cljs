(ns gigrig.positioning
  (:require [gigrig.powertree :as ptree]
            [gigrig.geometry.box :as box]
            [gigrig.components.boxes :as boxes]
            [clojure.zip :as zip]
            [gigrig.zipper :as gzip]))

(def GENERATOR-OFFSET "Vertical distance between the generator and the first node" 30)
(def ROOT-OFFSET "Horizontal displacement of a root node against it's child nodes" -10)
(def CHILDREN-OFFSET "Vertical distance between a root node and a child" 25)
(def ADAPTER-OFFSET "Vertical distance between an adaptor and it's suppliant" 13)
(def CHILD-SPACING "The horizontal spacing between children" 2)
(def CHILD-VERTICAL-STEP "Additional vertical distance increased for each child under same root" 15)

(declare emplace)

(defn- box
  "Returns box data for the given node at loc positioned on x and y"
  [loc x y]
  (case (gzip/loc-type loc)
    :pedal (boxes/pedal (gzip/box-meta loc) {:x x :y y})
    :isolator (boxes/isolator {:x x :y y})
    :distributor (boxes/distributor {:x x :y y})
    :time-lord (boxes/time-lord {:x x :y y})))

(defn- align
  "Calculates the box data for the given child"
  [loc x y]
  (let [x (+ CHILD-SPACING (if (= (zip/leftmost loc) loc) x (box/right (-> loc zip/left gzip/box-meta))))
        new-loc (gzip/set-meta loc (box loc x y))]
    (if (zip/branch? new-loc)
      (emplace new-loc x y)
      new-loc)))

(defn emplace
  "Takes in a zipper representing the powertree and returns a new tree
  containing the position of each element in the tree"
  ([tree] (emplace tree (+ 20 ROOT-OFFSET) GENERATOR-OFFSET))
  ([tree x y]
   (let [root (gzip/set-meta tree (box tree x y))]
     (gzip/reduce-children #(align % (+ x ROOT-OFFSET) (+ y CHILDREN-OFFSET)) root))))
