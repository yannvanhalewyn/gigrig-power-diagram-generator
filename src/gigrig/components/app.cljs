(ns gigrig.components.app
  (:require [gigrig.actions :as a]
            [redux.core :refer [dispatch!]]
            [gigrig.zipper :as gzip]
            [gigrig.components.diagram :as diagram]
            [gigrig.components.pedal-search :as pedal-search]))

(def test-tree
  [:distributor
   [[:pedal "pedal1"]
    [:pedal "pedal2"]
    [:pedal "pedal3"]
    [:pedal "pedal4"]
    [:pedal "pedal5"]
    [:distributor [[:pedal "pedal 6"]
                   [:pedal "pedal 7"]
                   [:isolator [[:pedal "pedal 8"]]]
                   [:distributor [[:pedal "pedal 9"]
                                  [:pedal "pedal 10"]]]]]]])

(defn component
  [state]
  [:div#app
   [:h1 "Power Supply Diagram generator!"]
   (for [[id field] (:search-fields @state)]
     ^{:key id}
     [pedal-search/component (assoc field :id id)])
   [:button {:on-click #(dispatch! a/add-pedal-button-clicked)} "+ Add pedal"]
   [diagram/component {:zipper (gzip/zipper test-tree)}]])
