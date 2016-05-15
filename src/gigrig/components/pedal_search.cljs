(ns gigrig.components.pedal-search
  (:require [redux.core :refer [dispatch!]]
            [reagent.core :as reagent]
            [gigrig.actions :as a]))

(defn- search-field [{:keys [on-focus on-blur handle-change value]}]
  [:input.pedal-search__input {:type "text"
                               :placeholder "Search for a pedal..."
                               :default-value value
                               :on-focus on-focus
                               :on-blur on-blur 
                               :on-change #(handle-change (.. % -target -value))}])

(defn- suggestion [props]
  [:li.suggestion {:on-mouse-down #(dispatch! a/pedal-selected (:id props))}
   [:strong.suggestion__model (:model props)]
   [:span.suggestion__brand (:brand props)]])

(defn dropdown [props]
  [:ul.suggestions-dropdown
   (for [s (:suggestions props)]
     ^{:key (:id s)} [suggestion s])])

(defn component []
  (let [dropdown-visible (reagent/atom false)]
    (fn [props]
      [:div.pedal-search-outer
       [:div.pedal-search
        [search-field {:on-focus #(do (reset! dropdown-visible true) nil)
                       :on-blur #(do (reset! dropdown-visible false) nil)
                       :value (:query props)
                       :handle-change (fn [val] (dispatch! a/searchfield-key-pressed val))}]
        (if @dropdown-visible
          [dropdown {:suggestions (:suggestions props)}])]])))
