package com.java401.AlbumCookies401.repostories;

import com.java401.AlbumCookies401.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> { }

