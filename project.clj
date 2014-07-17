(defproject omdev "0.1.2"
  :description "Dev component for Om (state history nav)"
  :url "http://example.com/LATER"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2202"]
                 [om "0.6.2"]
                 [ankha "0.1.4-SNAPSHOT"]]

  :plugins [[lein-cljsbuild "1.0.3"]]

  :hooks [leiningen.cljsbuild]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:compiler {:output-to "target/om-dev.js"
                        :optimizations :none
                        :pretty-print true}
                        :source-paths ["src"]}]})

