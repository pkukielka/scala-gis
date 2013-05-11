package com.pkukielka

import geoslick.PostgisDriver.extended._
import slick.session.Database.threadLocalSession

object ScalaGIS extends App {

  Database.forURL("jdbc:postgresql:gis", driver = "org.postgresql.Driver", user = "gisuser", password = "123") withSession {
    val q = for {
      l <- PlanetOSMLine if l.name.isNotNull
    } yield l.name

    q.to[List].filter(_.contains("Kraków")).foreach(println)
  }
}