name := "scala-webdriver"

scalaVersion := "2.10.2"

scalaBinaryVersion := "2.10"

mainClass in (Compile, run):= Some("crawl")

libraryDependencies += "org.seleniumhq.webdriver" % "webdriver-htmlunit" % "0.9.7376"
