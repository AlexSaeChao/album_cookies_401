package com.java401.AlbumCookies401.repostories;

import com.java401.AlbumCookies401.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AlbumCookiesRepository extends JpaRepository<Album, Long> {
    public static Album findByAlbumTitle(String albumTitle) {
        return null;
    }

}
