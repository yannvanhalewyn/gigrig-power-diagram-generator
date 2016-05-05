(ns gigrig.test-runner
  (:require [cljs.test :as test :include-macros true :refer [report]]
            [devtools.core :as devtools]
            [goog.string :as str]
            [goog.string.format]
            [gigrig.tests-to-run]))

(enable-console-print!)
(devtools/install! [:custom-formatters :sanity-hints])

(defn color-favicon-data-url
  "Takes a color and returns a 16x16 data url of the color"
  [color]
  (let [cvs (.createElement js/document "canvas")]
    (set! (.-width cvs) 16)
    (set! (.-height cvs) 16)
    (let [ctx (.getContext cvs "2d")]
      (set! (.-fillStyle ctx) color)
      (.fillRect ctx 0 0 16 16))
    (.toDataURL cvs)))

(defn change-favicon-to-color
  "Changes the tabs favicon to the given color"
  [color]
  (let [icon (.getElementById js/document "favicon")]
    (set! (.-href icon) (color-favicon-data-url color))))

(defn log
  "Logs any text to the console with the given color"
  [{:keys [color]} & args]
  (.log js/console (apply str "%c" args)
        (str "color: " color "; font-weight: bold")))

(defmethod report [::test/default :summary] [{:keys [fail error test pass]}]
  (let [failure (< 0 (+ fail error))
        color (if failure "#d00" "#0d0")]
    (log {:color "blue"}
         (str/format "Ran %d tests containing %d assertions" test (+ pass fail error)))
    (log {:color color}
         (str/format "%d failures, %d errors" fail error))
    (change-favicon-to-color color)))

(defmethod report [::test/default :fail] [{:keys [message] :as m}]
  (test/inc-report-counter! :fail)
  (.log js/console "expected:" (:expected m))
  (.log js/console "  actual:" (-> (:actual m) last last)))

(.clear js/console)

(test/run-all-tests #"gigrig.*-test")

(.groupCollapsed js/console "Figwheel Information")
