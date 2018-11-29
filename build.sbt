organization := "com.tresys"

name := "geonames"

version := "0.0.1"

crossPaths := false

scalaVersion := "2.12.7"

testOptions in ThisBuild += Tests.Argument(TestFrameworks.JUnit, "-v")

libraryDependencies in ThisBuild := Seq(
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "latest.integration" % "test"
)


