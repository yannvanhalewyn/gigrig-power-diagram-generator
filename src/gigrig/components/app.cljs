(ns gigrig.components.app
  (:require [gigrig.actions :as a]
            [redux.core :refer [dispatch!]]
            [gigrig.powertree :as ptree]
            [gigrig.components.diagram :as diagram]
            [gigrig.components.selected-pedals :as selected-pedals]
            [gigrig.positioning :as positioning]
            [gigrig.components.pedal-search :as pedal-search]))

(defn component
  [state]
  [:div#app
   [:h1 "Power Supply Diagram generator"]
   [pedal-search/component (:search-field @state)]
   [selected-pedals/component (:selected-pedals @state)]
   [diagram/component {:zipper (-> (:selected-pedals @state)
                                   ptree/build
                                   positioning/emplace)}]])
