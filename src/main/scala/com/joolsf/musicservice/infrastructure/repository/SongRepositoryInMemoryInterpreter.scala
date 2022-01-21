package com.joolsf.musicservice.infrastructure.repository

import cats.Applicative
import cats.implicits._
import com.joolsf.musicservice.domain.song.ValueClasses._
import com.joolsf.musicservice.domain.song._

import java.util.UUID
import scala.collection.concurrent.TrieMap

//All
class SongRepositoryInMemoryInterpreter[F[_] : Applicative] extends SongRepositoryAlg[F] {
  private val cache = new TrieMap[String, Song]

  def findAll: F[List[Song]] =
    cache.values.toList.pure[F]

  def findById(songId: SongId): F[Option[Song]] =
    cache.get(songId.value).pure[F]

  def create(item: CreateSong): F[Unit] = {
    val toSave = Song(
      SongId(UUID.randomUUID().toString),
      item.artist,
      item.title,
      List(item.genre)
    )

    cache.put(toSave.id.value, toSave)
    ().pure[F]
  }

  def update(item: UpdateSong): F[Unit] = ???
}
