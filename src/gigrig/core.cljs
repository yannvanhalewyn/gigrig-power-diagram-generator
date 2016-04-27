(ns gigrig.core
  (:require [gigrig.actions :as a]
            [redux.core :as redux :refer [dispatch!]]
            [reagent.core :as reagent]))

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
    (redux/register state main-reducer)
    (swap! state main-reducer {:type :init})
    (render)
    render))
