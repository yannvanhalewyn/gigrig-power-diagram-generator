(ns gigrig.powertree
  (:require [clojure.zip :as zip :refer [up down left right]]))

;; Zipper
;; ======
(defn- branch? [node]
  (or
   (= :distributor (first node))
   (= :isolator (first node))))

(defn- children [node]
  (rest node))

(defn- make-node [node children]
  (cons (first node) children))

(defn- zipper
  ([] (zipper :distributor))
  ([root] (zip/zipper branch? children make-node [root])))

(defn location-type [loc]
  (-> loc zip/node first))


;; Tree
;; ====
(def DISTRIBUTOR_LIMIT 5)

(defn insert [loc pedal]
  (if (<= (count (zip/children loc)) DISTRIBUTOR_LIMIT)
    (zip/append-child loc pedal)
    (let [new-node (zip/make-node loc [:distributor] [(last (zip/children loc)) pedal])]
      (-> loc
          zip/down
          zip/rightmost
          (zip/replace new-node)))))

;; Powertree
;; =========
(defn- simplify
  "returns a hashmap containing the prefered type of the power supply"
  [pedal]
  {:name (:name pedal)
   :power (-> (filter val pedal)
              keys
              last)})
