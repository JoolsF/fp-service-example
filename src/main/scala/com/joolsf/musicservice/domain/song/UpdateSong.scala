package com.joolsf.musicservice.domain.song

import com.joolsf.musicservice.domain.song.ValueClasses.{Genre, SongId}

case class UpdateSong(id: SongId,
                      genre: Genre)