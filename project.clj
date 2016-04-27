(defproject gigrig "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.8.40"]
                 [org.clojure/core.async "0.2.374"]
                 [reagent "0.5.1"]]

  :clean-targets ^{:protect false} ["resources/public/js" "target"]

  :profiles {:dev {:dependencies [[com.cemerick/piggieback "0.2.1"]
                                  [binaryage/devtools "0.6.1"]
                                  [org.clojure/tools.nrepl "0.2.11"]
                                  [figwheel-sidecar "0.5.2"]]
                   :source-paths ["src" "env/dev"]}}

  :plugins [[lein-cljsbuild "1.1.3"]
            [lein-figwheel "0.5.2"]]

  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src" "env/dev"]
                        :figwheel {:on-jsload "dev.user/render"}
                        :compiler {:main dev.user
                                   :optimizations :none
                                   :asset-path "js/out"
                                   :output-to "resources/public/js/core.js"
                                   :output-dir "resources/public/js/out"}}
                       {:id "min"
                        :source-paths ["src" "env/min"]
                        :compiler {:main gigrig.main
                                   :optimizations :advanced
                                   :output-to "resources/public/js/core.js"
                                   :closure-defines {"goog.DEBUG" false}}}]})


