package com.joolsf.musicservice.domain.song

import com.joolsf.musicservice.domain.song.ValueClasses.{Genre, SongArtist, SongId, SongTitle}

case class Song(id: SongId,
                artist: SongArtist,
                title: SongTitle,
                genres: List[Genre]
               )