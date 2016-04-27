(ns gigrig.components.pedal-search
  (:require [redux.core :refer [dispatch!]]
            [reagent.core :as reagent]
            [gigrig.actions :as a]))

(defn- search-field [{:keys [on-focus on-blur handle-change]}]
  [:input {:type "text"
           :placeholder "Search for a pedal"
           :on-focus on-focus
           :on-blur on-blur 
           :on-change #(handle-change (.. % -target -value))}])

(defn- suggestion [i props]
  ^{:key i} [:li
             [:strong (:model props)]
             (:brand props)])

(defn dropdown [props]
  [:ul
   (map-indexed suggestion (:suggestions props))])

(defn component []
  (let [dropdown-visible (reagent/atom false)]
    (fn [props]
      [:div
       [search-field {:on-focus #(do (reset! dropdown-visible true) nil)
                      :on-blur #(do (reset! dropdown-visible false) nil)
                      :handle-change (fn [val] (dispatch! a/searchfield-key-pressed (:id props) val))}]
       (if @dropdown-visible
         [dropdown (select-keys props [:suggestions])])])))
