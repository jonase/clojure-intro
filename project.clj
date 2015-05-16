(defproject clojure-intro "0.1.0"
  :description "Skeleton app for a 1hr Clojure introduction"
  :url "https://github.com/jonase/clojure-intro"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-beta3"]
                 [org.clojure/data.csv "0.1.2"]
                 [medley "0.6.0"]]
  :main ^:skip-aot gorilla-test.core
  :target-path "target/%s"
  :plugins [[lein-gorilla "0.3.4"]]
  :profiles {:uberjar {:aot :all}})
