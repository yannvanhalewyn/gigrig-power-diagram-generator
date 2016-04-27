(ns gigrig.core
  (:require [redux.core :as redux]
            [redux.middleware :as middleware]
            [gigrig.components.app :as app]
            [reagent.core :as reagent]))

(defn main-reducer [state action]
  (case (:type action)
    :init {:search-fields {(gensym) {:query ""}}}
    :add-search-field (assoc-in state [:search-fields (gensym)] {:query ""})
    :remove-search-field (update state :search-fields dissoc (:id action))
    :key-pressed (->  state
                      (assoc-in [:search-fields (:id action) :query] (:value action))
                      (assoc-in [:search-fields (:id action) :suggestions] (:suggestions action)))
    state))

(defn start []
  (let [element (.getElementById js/document "app")
        state (reagent/atom {})
        render #(reagent/render [app/component state] element)]
    (redux/register state main-reducer [#'middleware/logger])
    (swap! state main-reducer {:type :init})
    (render)
    render))
