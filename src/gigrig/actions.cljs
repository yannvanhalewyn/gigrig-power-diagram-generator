(ns gigrig.actions
  (:require [gigrig.search :as s]
            [gigrig.selectors :as selectors]
            [gigrig.data :refer [data]]))

(def indexed-data (map-indexed #(assoc %2 :id %1) data))

(defn searchfield-key-pressed [_ query-value]
  {:type :key-pressed
   :value query-value
   :query query-value
   :suggestions (s/search indexed-data query-value)})

(defn pedal-selected
  "User has clicked on a pedal from the suggestion drop-down."
  [_ id]
  {:type :pedal-selected
   :pedal (nth indexed-data id)})

(defn return-key-pressed
  "User has hit the return key"
  [state]
  {:type :pedal-selected
   :pedal (selectors/highlighted-pedal @state)})

(defn pedal-removed
  "User has clicked the clear button next to a selected pedal"
  [_ id]
  {:type :pedal-removed
   :id id})
