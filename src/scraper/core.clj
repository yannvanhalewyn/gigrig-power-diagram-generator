(ns scraper.core
  (:require [clojure.string :as str])
  (:gen-class))

(def url "https://docs.google.com/spreadsheets/d/1XMCStIcX-UkJF2YYmco7mnoSec8I8Vg_1wSSAVR7L00/export?format=csv")

(def input (slurp url))
(def entries (str/split input #"\n"))
(def an-entry (-> (str/split input #"\n")
                  (get 2)))

;; Helpers
;; =======
(defn- unicode-bool
  "Returns true if val is a unicode checkmark"
  [val]
  (= "✔" val))

(defn- update-fields
  "Applies f to each value of fields"
  [coll f fields]
  (reduce #(update %1 %2 f) coll fields))

;; Entry parsing
;; ===========
(defn split-entry
  "Splits the entry in an array of values"
  [csv-line]
  (drop 1 (str/split csv-line #",")))

(defn pedal
  "Builds a pedal hash-map from the values array"
  [values]
  (zipmap [:brand :model :distributor :isolator :adapter :comment] values))

(defn parse-boolean-fields
  "Updates :distributor, :isolator and :adapter to be proper booleans"
  [entry]
  (update-fields entry unicode-bool [:distributor :isolator :adapter]))

;; Parsing all the data
(defn parse-entries
  "Transforms all entries into pedals"
  [entries]
  (map #(-> (str/trim %)
            split-entry
            pedal
            parse-boolean-fields)
       entries))

(defn write-to-file
  "Writes the output to the data.cljs file"
  [entries]
  (spit
   "./src/gigrig/data.cljs"
   (with-out-str
     (println "(ns gigrig.data)")
     (println "(defonce data")
     (pr entries)
     (println ")"))))

(defn -main []
  (-> (slurp url)
      (str/split #"\n")
      (#(drop 2 %))
      parse-entries
      write-to-file))
