(ns gigrig.zipper
  (:require [clojure.zip :as zip]
            [gigrig.constants :refer [GIGRIG-PRODUCTS]]))

;; Zipper constructors
;; ===================
(defn- branch?
  "Returns true if the node is a distributor or isolator"
  [node]
  (some (partial = (first node)) GIGRIG-PRODUCTS))

(defn- children
  "Returns all the children of the node"
  [node]
  (second node))

(defn- make-node
  "Given the existing node and new children, returns a new node"
  [node children]
  (let [[type _ meta] node]
    [type children meta]))

(defn zipper
  "Builds our gigrig custom zipper"
  ([] (zipper [:distributor]))
  ([data] (zip/zipper branch? children make-node data)))

;; Zipper helpers
;; ==============
(defn loc-type
  "Returns the type of the node"
  [loc]
  (-> loc zip/node first))

(defn box-meta
  "Returns the diagram meta data for the node"
  [loc]
  (-> loc zip/node last))

(defn set-meta
  "Sets the diagram meta data for the node"
  [loc meta]
  (let [[type children] (zip/node loc)]
    (zip/replace loc [type children meta])))

(defn map-siblings
  "Returns a sequence by applying f to every sibling, starting on loc
  from left to right"
  [f loc]
  (if (= (zip/rightmost loc) loc)
    [(f loc)]
    (cons (f loc) (map-siblings f (zip/right loc)))))

(defn reduce-children
  "Applies f to every child node of root and returns a new zipper with
  updated children"
  [f root]
  (if-let [first-child (zip/down root)]
    (loop [loc first-child]
      (let [new-node (f loc)]
        (if-let [next (zip/right new-node)]
          (recur next)
          (zip/up new-node))))
    root))

(defn root
  "Returns the root node as it's own zipper"
  [loc]
  (if-let [up (zip/up loc)]
    (recur up)
    loc))
