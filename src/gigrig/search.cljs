(ns gigrig.search
  (:require [clojure.string :as str]))

(defn- match? [query pedal]
  (re-find (js/RegExp query "i") (str (:brand pedal) " " (:model pedal))))

(defn search [data query]
  ;; At least 2 chars for performance
  (when (not (or (< (count query) 2) (str/blank? query)))
    (filter (partial match? (str/trim query)) data)))
