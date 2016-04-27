(ns gigrig.core
  (:require [gigrig.components.pedal-search :as pedal-search]
            [redux.core :as redux]
            [redux.middleware :as middleware]
            [reagent.core :as reagent]))

(defn main-component
  [state]
  [:div#app
   [:h1 "Power Supply Diagram generator!"]
   [pedal-search/component (get-in @state [:search-fields 0])]])

(defn main-reducer [state action]
  (case (:type action)
    :init {:search-fields []}
    :key-pressed (->  state
                      (assoc-in [:search-fields 0 :query] (:value action))
                      (assoc-in [:search-fields 0 :suggestions] (:suggestions action)))
    state))

(defn start []
  (let [element (.getElementById js/document "app")
        state (reagent/atom {})
        render #(reagent/render [main-component state] element)]
    (redux/register state main-reducer [#'middleware/logger])
    (swap! state main-reducer {:type :init})
    (render)
    render))
