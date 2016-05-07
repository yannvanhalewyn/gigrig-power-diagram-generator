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

(defn- location-type [loc]
  (-> loc zip/node first))


;; Tree
;; ====
(def DISTRIBUTOR_LIMIT 6)
(def ISOLATOR_LIMIT 4)

(defn- insert [loc pedal]
  (if (< (count (zip/children loc)) DISTRIBUTOR_LIMIT)
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

(defn- zip-pedal [pedal]
  [:pedal (:name pedal)])

(defn- group-by-power [pedals]
  (-> (group-by :power pedals)))

(defn- zip-isolators [isolators]
  (for [pedals (partition-all ISOLATOR_LIMIT isolators)]
    (cons :isolator (map zip-pedal pedals))))

(defn- iterate-groups [groups]
  (reduce
   (fn [loc pedal] (insert loc pedal))
   (zipper)
   (concat
    (map zip-pedal (:distributor groups))
    (zip-isolators (:isolator groups)))))

;; Main
;; ====
(defn build
  "Builds the powertree for the given pedals"
  [pedals]
  (-> (map simplify pedals)
      group-by-power
      iterate-groups))
