(ns gigrig.components.pedal-search
  (:require [redux.core :refer [dispatch!]]
            [reagent.core :as reagent]
            [gigrig.actions :as a]))

(defn- handle-key-down [event]
  (case (.. event -keyCode)
    13 (dispatch! a/return-key-pressed)
    38 (dispatch! a/up-key-pressed)
    40 (dispatch! a/down-key-pressed)
    nil))

(defn- search-field [{:keys [on-focus on-blur value]}]
  [:input.pedal-search__input {:type "text"
                               :placeholder "Search for a pedal..."
                               :value value
                               :on-focus on-focus
                               :on-blur on-blur 
                               :on-key-down handle-key-down
                               :on-change #(dispatch! a/searchfield-key-pressed (.. % -target -value))}])

(defn- suggestion [props]
  [:li {:class (if (:highlight props) "suggestion--highlight" "suggestion")
        :on-mouse-down #(dispatch! a/pedal-selected (:id props))}
   [:strong.suggestion__model (:model props)]
   [:span.suggestion__brand (:brand props)]])

(defn dropdown [{:keys [suggestions highlighted-pedal]}]
  [:ul.suggestions-dropdown
   (for [s suggestions]
     ^{:key (:id s)} [suggestion (merge s {:highlight (= s highlighted-pedal)})])])

(defn component []
  (let [dropdown-visible (reagent/atom false)]
    (fn [props]
      [:div.pedal-search-outer
       [:div.pedal-search
        [search-field {:on-focus #(do (reset! dropdown-visible true) nil)
                       :on-blur #(do (reset! dropdown-visible false) nil)
                       :value (:query props)}]
        (if true
          [dropdown (select-keys props [:suggestions :highlighted-pedal])])]])))
