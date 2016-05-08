(ns gigrig.zipper
  (:require [clojure.zip :as zip]))

(defn- branch?
  "Returns true if the node is a distributor or isolator"
  [node]
  (or
   (= :distributor (first node))
   (= :isolator (first node))))

(defn- children
  "Returns all the children of the node"
  [node]
  (rest node))

(defn- make-node
  "Given the existing node and new children, returns a new node"
  [node children]
  (cons (first node) children))

(defn zipper
  "Builds our gigrig custom zipper"
  ([] (zipper :distributor))
  ([root] (zip/zipper branch? children make-node [root])))

(defn loc-typ [loc]
  (zip/node (first loc)))
