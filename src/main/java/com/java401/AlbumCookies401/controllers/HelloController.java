package com.java401.AlbumCookies401.controllers;

import com.java401.AlbumCookies401.models.Album;
import com.java401.AlbumCookies401.repostories.AlbumCookiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class HelloController {

    @Autowired
    AlbumCookiesRepository albumCookiesRepository;

    @GetMapping("/")
    public String getSplashPage() {
        return "splash";
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
        ArrayList<Album> albumCollection = (ArrayList<Album>) albumCookiesRepository.findAll(); // Rocio helped me with this
        Album album1 = new Album("Album 1", "Artist 1", 10, 300);
        Album album2 = new Album("Album 2", "Artist 2", 10, 900);
        Album album3 = new Album("Album 3", "Artist 3", 10, 300);

        albumCollection.add(album1);
        albumCollection.add(album2);
        albumCollection.add(album3);

        model.addAttribute("album", albumCollection);

        return "album";

    }

    @PostMapping("/albums")
    public RedirectView addAlbumFromForm(String title, String artist, Integer songCount, Integer songLength) {
        Album newAlbum = new Album(title, artist, songCount, songLength);
        albumCookiesRepository.save(newAlbum);
        return new RedirectView("/");
    }

}




