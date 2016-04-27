(ns gigrig.actions
  (:require [gigrig.search :as s]
            [gigrig.data :refer [data]]))

(defn searchfield-key-pressed [state field-id query-value]
  {:type :key-pressed
   :value query-value
   :id field-id
   :suggestions (s/search data query-value)})

(defn add-pedal-button-clicked [state]
  {:type :add-search-field})
