(ns gigrig.core
  (:require [gigrig.actions :as a]
            [redux.core :as redux :refer [dispatch!]]
            [redux.middleware :as middleware]
            [reagent.core :as reagent]))

(defn search-field [{:keys [handle-change]}]
  [:input {:type "text"
           :placeholder "Search for a pedal"
           :on-change #(handle-change (.. % -target -value))}])

(defn main-component
  [state]
  [:div#app
   [:h1 "Power Supply Diagram generator!"]
   [search-field {:handle-change (fn [val] (dispatch! a/searchfield-key-pressed val))}]])

(defn main-reducer [state action]
  (case (:type action)
    :init {:search-fields []}
    :key-pressed (assoc-in state [:search-fields 0 :query] (:value action))
    state))

(defn start []
  (let [element (.getElementById js/document "app")
        state (reagent/atom {})
        render #(reagent/render [main-component state] element)]
    (redux/register state main-reducer [#'middleware/logger])
    (swap! state main-reducer {:type :init})
    (render)
    render))
