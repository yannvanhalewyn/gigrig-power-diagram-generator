(ns gigrig.components.app
  (:require [gigrig.actions :as a]
            [redux.core :refer [dispatch!]]
            [gigrig.powertree :as ptree]
            [gigrig.zipper :as gzip]
            [gigrig.components.diagram :as diagram]
            [gigrig.components.pedal-search :as pedal-search]))

(def test-pedals
  [{:brand "Ibanez" :model "AD9 Analog Delay" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "TubeScreamer" :distributor true :isolator false :other false}
   {:brand "Ibanez" :model "Whammy" :distributor true :isolator false :other false}
   {:brand "Ibanez" :model "BlueSky" :distributor true :isolator true :other false}])

(def test-tree
  [:distributor [[:time-lord [:pedal "pedal1"]]]])

(defn component
  [state]
  [:div#app
   [:h1 "Power Supply Diagram generator!"]
   (for [[id field] (:search-fields @state)]
     ^{:key id}
     [pedal-search/component (assoc field :id id)])
   [:button {:on-click #(dispatch! a/add-pedal-button-clicked)} "+ Add pedal"]
   [diagram/component {:zipper (gzip/zipper test-tree)}]])
