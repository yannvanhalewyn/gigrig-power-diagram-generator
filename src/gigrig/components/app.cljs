(ns gigrig.components.app
  (:require [gigrig.actions :as a]
            [redux.core :refer [dispatch!]]
            [gigrig.powertree :as ptree]
            [gigrig.components.diagram :as diagram]
            [gigrig.components.selected-pedals :as selected-pedals]
            [gigrig.positioning :as positioning]
            [gigrig.selectors :as s]
            [gigrig.components.pedal-search :as pedal-search]))

(def build-tree (memoize #(-> % ptree/build positioning/emplace)))

(defn component
  [state]
  [:div#app
   [:h1 "Power Supply Diagram generator"]
   [pedal-search/component (s/apply-selectors @state {:query s/query
                                                      :suggestions s/suggestions
                                                      :highlighted-pedal s/highlighted-pedal})]
   [selected-pedals/component (:selected-pedals @state)]
   [diagram/component {:zipper (build-tree (:selected-pedals @state))}]])
