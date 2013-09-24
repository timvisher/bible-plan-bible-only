(defproject bible-plan-bible-only "0.1.0-SNAPSHOT"
  :description  "FIXME: write description"
  :url          "http://example.com/FIXME"
  :license      {:name "Eclipse Public License"
                 :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure       "1.5.1"]
                 [org.clojure/clojurescript "0.0-1889"]
                 [com.cemerick/piggieback "0.1.0"]]
  :profiles     {:dev {:repl-options {:init-ns          piggieback-server
                                      :nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
                     :plugins      [[lein-cljsbuild      "0.3.3"]]
                     :cljsbuild    {:builds [{:source-paths ["src/cljs"]
                                              :compiler     {:pretty-print  true
                                                             :output-to     "resources/public/bible-plan.js"
                                                             :optimizations :whitespace
                                                             :source-map    "resources/public/bible-plan.js.map"}}]}}})
