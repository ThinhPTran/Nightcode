(defproject nightcode "0.0.1"
  :license {:name "Public Domain"
            :url "http://unlicense.org/UNLICENSE"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [seesaw "1.4.3"]
                 [com.github.insubstantial/substance "7.1"]
                 [com.fifesoft/rsyntaxtextarea "2.0.6"]
                 [leiningen "2.2.0"]
                 [lein-droid "0.2.0-SNAPSHOT"]
                 [lein-cljsbuild "0.3.2"]
                 [net.java.balloontip/balloontip "1.2.1"]]
  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :main nightcode.core)
