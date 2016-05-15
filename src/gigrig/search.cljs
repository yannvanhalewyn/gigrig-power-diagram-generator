(ns gigrig.search
  (:require [clojure.string :as str]))

(defn- indexed-string-raw [pedal]
  (-> (str (:brand pedal) " " (:model pedal))
      (str/replace #"-" "")))

(def indexed-string (memoize indexed-string-raw))

(defn- match? [tokens pedal]
  (every? #(re-find (js/RegExp % "i") (indexed-string pedal)) tokens))

(defn- tokens [query]
  (-> (str/trim query)
      (str/replace #"-" "")
      (str/split #" ")))

(defn search [data query]
  ;; At least 2 chars for performance
  (when (not (or (< (count query) 2) (str/blank? query)))
    (filter (partial match? (tokens query)) data)))
