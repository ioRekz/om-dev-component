(defproject omdev "0.1.3-SNAPSHOT"
  :description "Dev component for Om (state history nav)"
  :url "http://example.com/LATER"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2227" :scope "prodived"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha" :scope "provided"]
                 [om "0.7.1" :scope "provided"]
                 [ankha "0.1.4-SNAPSHOT"]]

  :plugins [[lein-cljsbuild "1.0.3"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:compiler {:output-to "target/om-dev.js"
                        :optimizations :none
                        :pretty-print true}
                        :source-paths ["src"]}
             {:id "counters"
                           :source-paths ["src" "examples/counters/src"]
                           :compiler {
                             :output-to "examples/counters/main.js"
                             :output-dir "examples/counters/out"
                             :source-map true
                             :optimizations :none}}]})

