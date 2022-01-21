package com.joolsf.musicservice.domain.song

import com.joolsf.musicservice.domain.song.ValueClasses.{Genre, SongArtist, SongTitle}

case class CreateSong(artist: SongArtist,
                      title: SongTitle,
                      genre: Genre)