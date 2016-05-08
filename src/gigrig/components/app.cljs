(ns gigrig.components.app
  (:require [gigrig.actions :as a]
            [redux.core :refer [dispatch!]]
            [gigrig.zipper :as gzip]
            [gigrig.components.diagram :as diagram]
            [gigrig.components.pedal-search :as pedal-search]))

(def old-data
  {:type :distributor
   :children [
              {:type :pedal
               :name "Fuzz Factory"}
              {:type :pedal
               :name "Whammy"}
              {:type :pedal
               :name "Quartermaster"}
              {:type :isolator
               :children [{:type :distributor
                           :children [{:type :pedal
                                       :name "dd2"}]}
                          {:type :pedal
                           :name "TS-9"}]}
              {:type :pedal
               :name "DD-20 Giga-Delay"}
              {:type :distributor
               :children [{:type :pedal
                           :name "A Pedal"}
                          {:type :pedal
                           :name "Earthquaker Bit Commander"}]}]})

(defn component
  [state]
  [:div#app
   [:h1 "Power Supply Diagram generator!"]
   (for [[id field] (:search-fields @state)]
     ^{:key id}
     [pedal-search/component (assoc field :id id)])
   [:button {:on-click #(dispatch! a/add-pedal-button-clicked)} "+ Add pedal"]
   [diagram/component {:zipper (gzip/zipper [:distributor [[:pedal "pedal1"] [:pedal "pedal2"]]])}]])
