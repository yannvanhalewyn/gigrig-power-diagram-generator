(ns gigrig.actions
  (:require [gigrig.search :as s]
            [gigrig.data :refer [data]]))

(defn searchfield-key-pressed [_ field-id query-value]
  {:type :key-pressed
   :value query-value
   :id field-id
   :suggestions (s/search data query-value)})

(defn add-pedal-button-clicked [_]
  {:type :add-search-field})

(defn remove-pedal-button-clicked [_ id]
  {:type :remove-search-field
   :id id})
