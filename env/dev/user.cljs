(ns dev.user
  (:require [devtools.core :as devtools]
            [gigrig.core :as gigrig]))

(defonce run-once
  (do
    (enable-console-print!)
    (devtools/install! [:custom-formatters :sanity-hints])))

(defonce render
  (gigrig/start))
