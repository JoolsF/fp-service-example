package com.joolsf.musicservice

import cats.effect.{ExitCode, IO, IOApp}


object Main extends IOApp {
  def run(args: List[String]) =
    IO(ExitCode.Success)
}