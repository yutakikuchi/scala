name := "scala-jsoup"

scalaVersion := "2.10.2"

scalaBinaryVersion := "2.10"

mainClass in (Compile, run):= Some("crawl")

libraryDependencies += "org.jsoup" % "jsoup" % "1.8.1"
