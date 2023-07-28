package com.java401.AlbumCookies401.controllers;

import com.java401.AlbumCookies401.models.Album;
import com.java401.AlbumCookies401.models.Song;
import com.java401.AlbumCookies401.repostories.AlbumCookiesRepository;
import com.java401.AlbumCookies401.repostories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

//@Controller
//public class SongController {
//    @GetMapping("/")
//    public String getSongs(Model model) {
//        model.addAttribute("songs", ????)
//        return "song.html";
//    }
//}
//used demo to template out song controller
@Controller
public class SongController {

    @Autowired
    AlbumCookiesRepository albumCookiesRepository;
    @Autowired
    SongRepository songRepository;


    @PostMapping("/song/add")
    public RedirectView addSongToAlbum(String albumTitle, String name, Integer songCount, Integer songLength, String trackNumber) {
        Album album = albumCookiesRepository.findByAlbumTitle(albumTitle);

        if (album == null) {
            throw new IllegalArgumentException("Could not find Song with name " + albumTitle);
        }

        Song song = new Song(name, songCount, songLength, trackNumber);
        songRepository.save(song);

        return new RedirectView("/album");

    }
}
