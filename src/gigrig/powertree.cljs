(ns gigrig.powertree
  (:require [gigrig.zipper :as gzip]
            [clojure.zip :as zip]))


;; Tree
;; ====
(def DISTRIBUTOR_LIMIT 6)
(def ISOLATOR_LIMIT 4)

(defn- insert
  "Inserts a pedal at the given location in zipper. When full, the
  last child will be replaced with a new branch containing both the
  removed child and the new one."
  [loc pedal]
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

(defn- zip-pedal
  "Returns a version of our pedal coherent with our zip model."
  [pedal]
  [:pedal (:name pedal)])

(defn- zip-isolators
  "Partitions the isolators and returns an array of zipper
  isolators. E.g: [:isolator [:pedal '1'] [:pedal '2']]"
  [isolators]
  (for [pedals (partition-all ISOLATOR_LIMIT isolators)]
    (cons :isolator (map zip-pedal pedals))))

(defn- group-by-power
  "Groups the pedals by whatever power supply they require"
  [pedals]
  (group-by :power pedals))

(defn- prepare-groups
  "Transforms the power group map into an array of entities ready to
  be zipped, e.g: pedals and isolators with pedals"
  [groups]
  (concat
   (map zip-pedal (:distributor groups))
   (zip-isolators (:isolator groups))))

(defn- build-zipper
  "Inserts all entities into a new gigrig zipper"
  [entities]
  (reduce insert (gzip/zipper) entities))

;; Main
;; ====
(defn build
  "Builds the powertree for the given pedals."
  [pedals]
  (-> (map simplify pedals)
      group-by-power
      prepare-groups
      build-zipper))
