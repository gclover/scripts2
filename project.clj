(defproject jvm-tpl "0.1.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]] 
 ; :uberjar-exclusions [#"hadoop*"]
  :aot [#"jvm-tpl*"]
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :java-source-paths ["src/main/java"]
  :repositories [["local" "http://10.200.41.5:4041/nexus/content/repositories/releases"]
		 ["clojars" "http://clojars.org/repo"]
                 ["maven2" "http://repo1.maven.org/maven2"]]
  :offline? true
  :plugins [[org.clojure/clojure-contrib "1.2.0"]]
  :omit-source true
  ;:main jvm-tpl.core
)
