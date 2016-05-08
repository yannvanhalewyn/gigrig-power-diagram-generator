(ns gigrig.actions
  (:require [gigrig.search :as s]
            [gigrig.data :refer [data]]))

(def indexed-data (map-indexed #(assoc %2 :id %1) data))

(defn searchfield-key-pressed [_ field-id query-value]
  {:type :key-pressed
   :value query-value
   :id field-id
   :query query-value
   :suggestions (s/search indexed-data query-value)})

(defn add-pedal-button-clicked [_]
  {:type :add-search-field})

(defn remove-pedal-button-clicked [_ id]
  {:type :remove-search-field
   :id id})

(defn pedal-selected
  "Use has clicked on a pedal from the suggestion drop-down."
  [_ pedal-id searchfield-id]
  {:type :pedal-selected
   :searchfield searchfield-id
   :pedal (nth indexed-data pedal-id)})

(defn pedal-deselected
  "User has clicked the clear button next to a selected pedal"
  [_ searchfield-id]
  {:type :pedal-deselected
   :searchfield searchfield-id})
