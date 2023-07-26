package com.java401.AlbumCookies401.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    String artist;
    int songCount;
    int songLength;
    public String imageURL;


//    public Album(String title, String artist, int songCount, int songLength, String imageURL) {
//        this.title = title;
//        this.artist = artist;
//        this.songCount = songCount;
//        this.songLength = songLength;
//        this.imageURL = imageURL;
//    }

    protected Album() {

    }

    public Album(Long id, String title, String artist, int songCount, int songLength) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.songLength = songLength;
    }

    public Album(String title, String artist, int songCount, int songLength) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.songLength = songLength;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", songCount=" + songCount +
                ", songLength=" + songLength +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}

