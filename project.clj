(defproject server "0.1.0-SNAPSHOT"
  :description "The best backend ever"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [
                 [org.clojure/clojure "1.9.0"]
                 [org.clojure/java.jdbc "0.7.9"]
                 [org.postgresql/postgresql "9.4-1201-jdbc41"]
                 [ring "1.7.1"]
                 [compojure "1.6.1"]
                 ]
  :main ^:skip-aot server.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
