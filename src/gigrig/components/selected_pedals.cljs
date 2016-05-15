(ns gigrig.components.selected-pedals
  (:require [redux.core :refer [dispatch!]]
            [gigrig.actions :as a]))

(defn pedal [{:keys [pedal id]}]
  [:div.selected-pedal
   [:span (:model pedal)]
   [:button.selected-pedal__remove {:on-click #(dispatch! a/pedal-removed id)}]])

(defn component [pedals]
  [:div.selected-pedals
   (map-indexed (fn [i p] ^{:key i} [pedal {:pedal p :id i}]) pedals)])
