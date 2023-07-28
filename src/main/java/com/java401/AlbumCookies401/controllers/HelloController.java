package com.java401.AlbumCookies401.controllers;

import com.java401.AlbumCookies401.models.Album;
import com.java401.AlbumCookies401.repostories.AlbumCookiesRepository;
import com.java401.AlbumCookies401.repostories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;


import java.util.List;

@Controller
public class HelloController {

    @Autowired
    AlbumCookiesRepository albumCookiesRepository;

    @GetMapping("/")
    public String getSplashPage() {
        return "album.html";
    }


    @GetMapping("/hello")
    public String getHelloWorld() {
        return "hello";
    }

    @GetMapping("/capitalize/{Input}")
    public String getCapitalize(@PathVariable String Input, Model model) {
        String capitalizedWords = Input.toUpperCase();
        model.addAttribute("Input", capitalizedWords);
        return "capitalize";
    }

    @GetMapping("/album")
    public String getAlbums(Model model) {
        List<Album> albumCollection = albumCookiesRepository.findAll();
        model.addAttribute("album", albumCollection);
        return "album";
    }

    @PostMapping("/album") // Adjust the endpoint to match the form action
    public RedirectView addAlbumFromForm(String albumTitle, String artist, Integer songCount, Integer songLength) {
        Album newAlbum = new Album(albumTitle, artist, songCount, songLength);
        albumCookiesRepository.save(newAlbum);
        return new RedirectView("/album"); // Redirect to the correct endpoint after adding the album
    }

}




