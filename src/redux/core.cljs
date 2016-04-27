(ns redux.core
  (:require-macros [cljs.core.async.macros :refer [go-loop]])
  (:require [cljs.core.async :refer [chan put! <!]]))

(def ^:private DISPATCH_QUEUE (chan))

(defn dispatch!
  "Takes any message and puts it on the queue."
  [f & args]
  (put! DISPATCH_QUEUE {:f f :args args})
  nil)

(defn register
  [state reducer]
  (go-loop []
    (let [{:keys [f args]} (<! DISPATCH_QUEUE)]
      (swap! state reducer (f state args))
      (prn @state)
      (recur))))
