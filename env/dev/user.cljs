(ns dev.user
  (:require [gigrig.core :as gigrig]))

(defonce run-once
  (do
    (enable-console-print!)))

(defonce render
  (gigrig/start))
