(ns gigrig.components.pedal-search
  (:require [redux.core :refer [dispatch!]]
            [reagent.core :as reagent]
            [gigrig.actions :as a]))

(def ENTER-KEY 13)

(defn- search-field [{:keys [on-focus on-blur value handle-return-key]}]
  [:input.pedal-search__input {:type "text"
                               :placeholder "Search for a pedal..."
                               :value value
                               :on-focus on-focus
                               :on-blur on-blur 
                               :on-key-down #(when (= ENTER-KEY (.. % -keyCode)) (handle-return-key))
                               :on-change #(dispatch! a/searchfield-key-pressed (.. % -target -value))}])

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
                       :handle-return-key #(dispatch! a/pedal-selected (-> props :suggestions first :id))}]
        (if @dropdown-visible
          [dropdown {:suggestions (:suggestions props)}])]])))
