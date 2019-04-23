(ns server.core
  (:gen-class)
  (:require [clojure.java.jdbc :as jdbc]))

(def db
  {
   :dbtype "postgresql"
   :dbname "tcg"
   :user "client"
   :password "client"
   })

(def all_in_table
  (jdbc/query db ["Select * from test"])
  )
(def id "TCG Database")

