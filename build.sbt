val root = (project in file("."))
  .settings(
    name := "dfdl-geonames",

    organization := "com.tresys",

    version := "0.1.0-SNAPSHOT"
  )
  .daffodilProject()
