(ns gigrig.positioning
  (:require [gigrig.powertree :as ptree]
            [gigrig.geometry.rect :as rect]
            [gigrig.boxed-text-data :as btd]
            [gigrig.constants :refer [ADAPTERS]]
            [clojure.zip :as zip]
            [gigrig.zipper :as gzip]))

(def GENERATOR-OFFSET    "Vertical distance between the generator and the first node"            30)
(def ROOT-OFFSET         "Horizontal displacement of a root node against it's child nodes"       -10)
(def CHILDREN-OFFSET     "Vertical distance between a root node and a child"                     25)
(def ADAPTER-OFFSET      "Vertical distance between an adaptor and it's suppliant"               13)
(def CHILD-SPACING       "The horizontal spacing between children"                               2)
(def CHILD-VERTICAL-STEP "Additional vertical distance increased for each child under same root" 15)

(declare emplace)

(defn- box
  "Returns box data for the given node at loc positioned on x and y"
  [loc x y]
  (case (gzip/loc-type loc)
    :pedal (btd/pedal (gzip/box-meta loc) {:x x :y y})
    :isolator (btd/isolator {:x x :y y})
    :distributor (btd/distributor {:x x :y y})
    (btd/adapter (gzip/loc-type loc) {:x x :y y})))

(defn- adapter?
  "Returns true if location is an adaptor type. eg: Timelord, Doubler, etc.."
  [loc]
  (some (partial = (gzip/loc-type loc)) (map :key ADAPTERS)))

(defn- children-y
  "Returns the vertical displacement for new children. Takes into
  account other siblings that have children and adds extra
  displacement to prevent collision"
  [loc]
  (let [branches-to-the-right
        (count (filter #(some (partial = (first %)) [:distributor :isolator]) (zip/rights loc)))]
    (if (adapter? loc)
      ADAPTER-OFFSET
      (+ CHILDREN-OFFSET (* branches-to-the-right CHILD-VERTICAL-STEP)))))

(defn child-x
  "Returns the x position for a child. Takes into account other
  siblings and their children"
  [loc]
  (max
   ;; The x value of the right wall of the sibling to the left
   (rect/right (-> loc zip/left gzip/box-meta))
   ;; The x value of the right wall of the previous sibling's child if adapter
   (when (adapter? (zip/left loc))
     (+ 7 (rect/right (if-let [child (-> loc zip/left zip/down)]
                        (-> child gzip/box-meta)))))))

(defn- align
  "Calculates the box data for the given child"
  [loc x y]
  (let [x (+ CHILD-SPACING (if (= (zip/leftmost loc) loc) x (child-x loc)))
        new-loc (gzip/set-meta loc (box loc x y))]
    (if (zip/branch? new-loc)
      (emplace new-loc x y)
      new-loc)))

(defn emplace
  "Takes in a zipper representing the powertree and returns a new tree
  containing the position of each element in the tree"
  ([tree] (emplace tree (+ 30 ROOT-OFFSET) GENERATOR-OFFSET))
  ([tree x y]
   (let [root (gzip/set-meta tree (box tree x y))
         children-x (+ x ROOT-OFFSET)
         children-y (+ y (children-y tree))]
     (gzip/reduce-children #(align % children-x children-y) root))))
