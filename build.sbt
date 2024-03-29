name := """practiceScalaAkka"""

version := "1.0"

scalaVersion := "2.11.6"

lazy val akkaVersion = "2.4.0"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.jsoup" % "jsoup" % "1.8.3" withSources(),
  "org.apache.kafka" % "kafka_2.11" % "1.1.1",
  "net.manub" %% "scalatest-embedded-kafka" % "2.0.0" % "test"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")
