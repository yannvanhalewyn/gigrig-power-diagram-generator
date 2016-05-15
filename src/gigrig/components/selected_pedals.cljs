(ns gigrig.components.selected-pedals
  (:require [redux.core :refer [dispatch!]]
            [gigrig.actions :as a]))

(defn pedal [{:keys [pedal id]}]
  [:div
   [:strong (:model pedal)]
   [:span (:brand pedal)]
   [:button {:on-click #(dispatch! a/pedal-removed id)} "x"]])

(defn echo [a] (.log js/console a) a)

(defn component [pedals]
  [:div.selected-pedals
   (map-indexed (fn [i p] ^{:key i} [pedal {:pedal p :id i}]) pedals)])
