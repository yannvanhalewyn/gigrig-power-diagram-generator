(ns gigrig.parse
  (:require [pl.danieljanus.tagsoup :as t]))

(def html (slurp "data.html"))
(def data (t/parse "data.html"))
data
