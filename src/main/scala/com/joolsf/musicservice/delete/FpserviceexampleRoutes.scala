//package com.joolsf.musicservice.delete
//
//import cats.effect.Sync
//import org.http4s.HttpRoutes
//import org.http4s.dsl.Http4sDsl
//
//object FpserviceexampleRoutes {
//
//  def jokeRoutes[F[_] : Sync](J: Jokes[F]): HttpRoutes[F] = {
//    val dsl = new Http4sDsl[F] {}
//    import dsl._
//    HttpRoutes.of[F] {
//      case GET -> Root / "joke" =>
//        for {
//          joke <- J.get
//          resp <- Ok(joke)
//        } yield resp
//    }
//  }
//
//  def helloWorldRoutes[F[_] : Sync](H: HelloWorld[F]): HttpRoutes[F] = {
//    val dsl = new Http4sDsl[F] {}
//    import dsl._
//    HttpRoutes.of[F] {
//      case GET -> Root / "hello" / name =>
//        for {
//          greeting <- H.hello(HelloWorld.Name(name))
//          resp <- Ok(greeting)
//        } yield resp
//    }
//  }
//}
