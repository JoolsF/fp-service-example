package com.joolsf.musicservice.domain.song

import eu.timepit.refined.types.string.NonEmptyString
import io.estatico.newtype.macros.newtype

object ValueClasses {
  // @newtype requires value classes to be in object
  @newtype case class SongId(value: String) //TODO use uuid refined type

  @newtype case class SongTitle(value: NonEmptyString)

  @newtype case class SongArtist(value: NonEmptyString)

  @newtype case class Genre(value: NonEmptyString)

}
