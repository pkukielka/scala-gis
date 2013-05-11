import sbt._
import sbt.Keys._

object ScalaGISBuild extends Build {

  lazy val scalaGIS = Project(
    id = "scala-gis",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "scala-gis",
      organization := "com.pkukielka",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.0",
      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
      libraryDependencies ++= Seq(
        "com.vividsolutions" % "jts" % "1.11",
        "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
        "com.typesafe.slick" %% "slick" % "1.0.0",
        "org.scala-lang" % "scala-compiler" % "2.10.0"
      )
    )
  )
}
