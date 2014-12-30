name := "scala-webdriver"

scalaVersion := "2.10.4"

scalaBinaryVersion := "2.10"

mainClass in (Compile, run):= Some("crawl")

libraryDependencies += "net.databinder.dispatch" %% "dispatch-core" % "0.11.2"
