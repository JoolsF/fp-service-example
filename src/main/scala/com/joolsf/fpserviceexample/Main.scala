package com.joolsf.fpserviceexample

import cats.effect.{ExitCode, IO, IOApp}

object Main extends IOApp {
  def run(args: List[String]) =
    FpserviceexampleServer.stream[IO].compile.drain.as(ExitCode.Success)
}
