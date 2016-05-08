(ns gigrig.components.pedal-search
  (:require [redux.core :refer [dispatch!]]
            [reagent.core :as reagent]
            [gigrig.actions :as a]))

(defn- search-field [{:keys [on-focus on-blur handle-change value]}]
  [:input {:type "text"
           :placeholder "Search for a pedal"
           :default-value value
           :on-focus on-focus
           :on-blur on-blur 
           :on-change #(handle-change (.. % -target -value))}])

(defn- suggestion [props]
  [:li {:on-mouse-down #(dispatch! a/pedal-selected (:id props) (:searchfield-id props))}
   [:strong (:model props)]
   (:brand props)])

(defn dropdown [props]
  [:ul
   (for [s (:suggestions props)]
     ^{:key (:id s)} [suggestion (merge s {:searchfield-id (:id props)})])])

(defn pedal-search []
  (let [dropdown-visible (reagent/atom false)]
    (fn [props]
      [:div
       [search-field {:on-focus #(do (reset! dropdown-visible true) nil)
                      :on-blur #(do (reset! dropdown-visible false) nil)
                      :value (:query props)
                      :handle-change (fn [val] (dispatch! a/searchfield-key-pressed (:id props) val))}]
       [:button {:on-click #(dispatch! a/remove-pedal-button-clicked (:id props))} "X"]
       (if @dropdown-visible
         [dropdown (select-keys props [:suggestions :id])])])))

(defn pedal-show [{:keys [pedal id]}]
  [:div
   [:strong (:model pedal)]
   [:span (:brand pedal)]
   [:button {:on-click #(dispatch! a/pedal-deselected id)} "x"]])

(defn component [props]
  (if (:pedal props)
    [pedal-show (select-keys props [:pedal :id])]
    [pedal-search props]))
