//package com.joolsf.musicservice.delete
//
//import cats.effect.{Async, Resource}
//import fs2.Stream
//import org.http4s.ember.client.EmberClientBuilder
//import org.http4s.ember.server.EmberServerBuilder
//import org.http4s.server.middleware.Logger
//
//object FpserviceexampleServer {
//
//  def stream[F[_] : Async]: Stream[F, Nothing] = {
//    for {
//      client <- Stream.resource(EmberClientBuilder.default[F].build)
//      helloWorldAlg = HelloWorld.impl[F]
//      jokeAlg = Jokes.impl[F](client)
//
//      // Combine Service Routes into an HttpApp.
//      // Can also be done via a Router if you
//      // want to extract a segments not checked
//      // in the underlying routes.
//      httpApp = (
//        FpserviceexampleRoutes.helloWorldRoutes[F](helloWorldAlg) <+>
//          FpserviceexampleRoutes.jokeRoutes[F](jokeAlg)
//        ).orNotFound
//
//      // With Middlewares in place
//      finalHttpApp = Logger.httpApp(true, true)(httpApp)
//
//      exitCode <- Stream.resource(
//        EmberServerBuilder.default[F]
//          .withHost(ipv4"0.0.0.0")
//          .withPort(port"8080")
//          .withHttpApp(finalHttpApp)
//          .build >>
//          Resource.eval(Async[F].never)
//      )
//    } yield exitCode
//  }.drain
//}
