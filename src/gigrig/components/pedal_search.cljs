(ns gigrig.components.pedal-search
  (:require [redux.core :refer [dispatch!]]
            [gigrig.actions :as a]))

(defn- search-field [{:keys [handle-change]}]
  [:input {:type "text"
           :placeholder "Search for a pedal"
           :on-change #(handle-change (.. % -target -value))}])

(defn- suggestion [i props]
  ^{:key i} [:li
             [:strong (:model props)]
             (:brand props)])

(defn dropdown [props]
  [:ul
   (map-indexed suggestion (:suggestions props))])

(defn component [props]
  [:div
   [search-field {:handle-change (fn [val] (dispatch! a/searchfield-key-pressed val))}]
   [dropdown (select-keys props [:suggestions])]])
