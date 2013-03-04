(defproject repotest "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
		 [local/netty "3.2.5"]]
  :repositories [["local" "http://10.200.41.5:4041/nexus/content/repositories/releases/"]
		 ["clojars" "http://clojars.org/repo"]
                 ["maven2" "http://repo1.maven.org/maven2"]]
  :main repotest.core)
