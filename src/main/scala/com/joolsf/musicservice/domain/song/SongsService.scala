package com.joolsf.musicservice.domain.song

import com.joolsf.musicservice.domain.song.ValueClasses.SongId

/*
  interpreter - naming convention ....Service
  state is encapsulated in the interpreter.

  Since this is "business logic interpreter" it belongs here
 */
class SongsService[F[_]](songRepositoryAlg: SongRepositoryAlg[F]) {
  def findAll: F[List[Song]] = songRepositoryAlg.findAll

  def findById(songId: SongId): F[Option[Song]] = songRepositoryAlg.findById(songId)

  def create(item: CreateSong): F[Unit] = songRepositoryAlg.create(item)

  def update(item: UpdateSong): F[Unit] = songRepositoryAlg.update(item)

}
