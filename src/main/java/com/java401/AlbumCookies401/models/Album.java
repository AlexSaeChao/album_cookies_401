package com.java401.AlbumCookies401.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String albumTitle;
    String artist;
    Integer songCount;
    Integer songLength;
    public String imageURL;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Song> songs = new ArrayList<>();

//    public Album(String albumTitle, String artist, int songCount, int songLength, String imageURL) {
//        this.albumTitle = albumTitle;
//        this.artist = artist;
//        this.songCount = songCount;
//        this.songLength = songLength;
//        this.imageURL = imageURL;
//    }

    protected Album() {

    }


    public Album(String albumTitle, String artist, int songCount, int songLength) {
        this.albumTitle = albumTitle;
        this.artist = artist;
        this.songCount = songCount;
        this.songLength = songLength;
    }


    public String getTitle() {
        return albumTitle;
    }

    public void setTitle(String title) {
        this.albumTitle = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public int getSongLength() {
        return songLength;
    }

    public void setSongLength(int songLength) {
        this.songLength = songLength;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumTitle='" + albumTitle + '\'' +
                ", artist='" + artist + '\'' +
                ", songCount=" + songCount +
                ", songLength=" + songLength +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}

