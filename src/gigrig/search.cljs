(ns gigrig.search
  (:require [clojure.string :as str]))

(defn- match? [query pedal]
  (re-find (js/RegExp query "i") (str (:brand pedal) (:model pedal))))

(defn search [data query]
  (when (not (str/blank? query))
    (filter (partial match? (str/trim query)) data)))
