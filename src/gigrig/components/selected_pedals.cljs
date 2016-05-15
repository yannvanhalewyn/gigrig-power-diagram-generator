(ns gigrig.components.selected-pedals
  (:require [redux.core :refer [dispatch!]]
            [gigrig.powertree :as ptree]
            [gigrig.actions :as a]))

(defn- in-diagram?
  "Wether or not the pedal has sufficient data to be rendered in the
  diagram"
  [pedal]
  (some #(% pedal) [:adapter :isolator :distributor]))

(defn pedal [{:keys [pedal id]}]
  [:div {:class (if (in-diagram? pedal) "selected-pedal" "selected-pedal--red")}
   [:span (:model pedal)]
   [:button.selected-pedal__remove {:on-click #(dispatch! a/pedal-removed id)}]])

(defn component [pedals]
  [:div.selected-pedals
   (map-indexed (fn [i p] ^{:key i} [pedal {:pedal p :id i}]) pedals)])
