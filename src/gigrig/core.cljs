(ns gigrig.core
  (:require [redux.core :as redux]
            [redux.middleware :as middleware]
            [gigrig.reducers :as reducers]
            [gigrig.components.app :as app]
            [reagent.core :as reagent]))

(defn start []
  (let [element (.getElementById js/document "app")
        state (reagent/atom {})
        render #(reagent/render [app/component state] element)]
    (redux/register state reducers/app [#'middleware/logger])
    (swap! state reducers/app {:type :init})
    (render)
    render))
