(ns redux.middleware)

(defn logger
  "Middleware for logging actions in debug mode"
  [next]
  (fn [state action]
    (if goog.DEBUG
      (let [prev-state state
            group-name (str "Action: " (:type action))
            next-state (next state action)]
        (.groupCollapsed js/console group-name)
        (.info js/console "%c PREV" "color: #9E9E9E; font-weight: bold" (sort prev-state))
        (.info js/console "%c ACTION" "color: #03A9F4; font-weight: bold" action)
        (.info js/console "%c NEXT" "color: #4CAF50; font-weight: bold" (sort next-state))
        (.groupEnd js/console group-name)
        next-state)
      (next state action))))
