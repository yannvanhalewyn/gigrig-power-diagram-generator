(ns gigrig.components.app
  (:require [gigrig.actions :as a]
            [redux.core :refer [dispatch!]]
            [gigrig.components.diagram :as diagram]
            [gigrig.components.pedal-search :as pedal-search]))

(defn component
  [state]
  [:div#app
   [:h1 "Power Supply Diagram generator!"]
   (for [[id field] (:search-fields @state)]
     ^{:key id}
     [pedal-search/component (assoc field :id id)])
   [:button {:on-click #(dispatch! a/add-pedal-button-clicked)} "+ Add pedal"]
   [diagram/component {:type :distributor
                       :children [
                                  {:type :pedal
                                   :name "Fuzz Factory"}
                                  {:type :pedal
                                   :name "Whammy"}
                                  {:type :pedal
                                   :name "Quartermaster"}
                                  {:type :pedal
                                   :name "DD-20 Giga-Delay"}
                                  {:type :pedal
                                   :name "TS-9"}
                                  {:type :distributor
                                   :children [{:type :pedal
                                               :name "A Pedal"}
                                              {:type :pedal
                                               :name "Earthquaker Bit Commander"}]}]}]])
