(ns gigrig.components.app
  (:require [gigrig.actions :as a]
            [redux.core :refer [dispatch!]]
            [gigrig.selectors :as selectors]
            [gigrig.powertree :as ptree]
            [gigrig.components.diagram :as diagram]
            [gigrig.positioning :as positioning]
            [gigrig.components.pedal-search :as pedal-search]))

(defn component
  [state]
  [:div#app
   [:h1 "Power Supply Diagram generator!"]
   (for [[id field] (:search-fields @state)]
     ^{:key id}
     [pedal-search/component (assoc field :id id)])
   [:button {:on-click #(dispatch! a/add-pedal-button-clicked)} "+ Add pedal"]
   [diagram/component {:zipper (-> @state
                                   selectors/selected-pedals
                                   ptree/build
                                   positioning/emplace)}]])
