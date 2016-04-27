(ns gigrig.core
  (:require [reagent.core :as reagent]))

(defonce data
  [
   {:brand "Boss" :model "DD-20 Giga Delay" :distributor true :isolator true}
   {:brand "Ibanez" :model "TS9 TubeScreamer" :distributor true :isolator true}
   {:brand "Electro-Harmonix" :model "Micro POG" :distributor false :isolator false :other true :comment "TimeLord"}
   {:brand "Aguilar" :model "Agro" :distributor true :isolator true}])

(defn search-field [{:keys [handle-change]}]
  [:input {:type "text"
           :placeholder "Search for a pedal"
           :on-change #(handle-change (.. % -target -value))}])

(defn main-component
  [state]
  [:div#app
   [:h1 "Power Supply Diagram generator!"]
   [search-field {:handle-change (fn [val] (dispatch! #(js/alert "ok") val))}]])

(defn start []
  (let [element (.getElementById js/document "app")
        state (reagent/atom {})
        render #(reagent/render [main-component state] element)]
    (render)
    render))
