(ns gigrig.components.app
  (:require [gigrig.actions :as a]
            [redux.core :refer [dispatch!]]
            [gigrig.components.pedal-search :as pedal-search]))

(defn component
  [state]
  [:div#app
   [:h1 "Power Supply Diagram generator!"]
   (map-indexed
    (fn [i field]
      ^{:key i}
      [pedal-search/component (assoc field :id i)])
    (:search-fields @state))
   [:button {:on-click #(dispatch! a/add-pedal-button-clicked)} "+ Add pedal"]])
