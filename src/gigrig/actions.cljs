(ns gigrig.actions
  (:require [gigrig.search :as s]
            [gigrig.data :refer [data]]))

(defn searchfield-key-pressed [state query-value]
  {:type :key-pressed
   :value query-value
   :suggestions (s/search data query-value)})
