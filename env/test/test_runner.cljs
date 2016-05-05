(ns gigrig.test-runner
  (:require [cljs.test :as test :include-macros true :refer [report]]
            [devtools.core :as devtools]
            [gigrig.tests-to-run]))

(enable-console-print!)
(devtools/install! [:custom-formatters :sanity-hints])

(test/run-all-tests #"gigrig.*-test")

(.groupCollapsed js/console "Figwheel Information")
