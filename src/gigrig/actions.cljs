(ns gigrig.actions
  (:require [gigrig.search :as s]
            [gigrig.selectors :as selectors]
            [gigrig.data :refer [data]]))

(def indexed-data (map-indexed #(assoc %2 :id %1) data))

(defn searchfield-key-pressed [_ query-value]
  {:type :key-pressed
   :value query-value
   :query query-value
   :suggestions (vec (s/search indexed-data query-value))})

(defn pedal-selected
  "User has clicked on a pedal from the suggestion drop-down."
  [_ id]
  {:type :pedal-selected
   :pedal (nth indexed-data id)})

(defn return-key-pressed
  "User has hit the return key"
  [state]
  (if-let [pedal (selectors/highlighted-pedal @state)]
    {:type :pedal-selected :pedal pedal}))

(defn down-key-pressed [state]
  {:type :update-highlight-index
   :idx (min (- (count (selectors/suggestions @state)) 1) (inc (selectors/highlighted-idx @state)))})

(defn up-key-pressed [state]
  {:type :update-highlight-index
   :idx (max 0 (dec (selectors/highlighted-idx @state)))})

(defn suggestion-hovered
  "Mouse has hovered over a suggested pedal"
  [state idx]
  {:type :update-highlight-index
   :idx idx})

(defn pedal-removed
  "User has clicked the clear button next to a selected pedal"
  [_ id]
  {:type :pedal-removed
   :id id})
