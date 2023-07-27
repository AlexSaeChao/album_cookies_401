package com.java401.AlbumCookies401.models;

import jakarta.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;

    Integer songCount;
    Integer songLength;
    String trackNumber;

    @ManyToOne
    Album album;

    protected Song() {

    }

    public Song(String name, Integer songCount, Integer songLength, String trackNumber) {
        this.name = name;
        this.songCount = songCount;
        this.songLength = songLength;
        this.trackNumber = trackNumber;
    }

    public void setSongCount(Integer songCount) {
        this.songCount = songCount;
    }

    public void setSongLength(Integer songLength) {
        this.songLength = songLength;
    }

    public String getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber;
    }

    public int getSongLength() {
        return songLength;
    }

    public void setSongLength(int songLength) {
        this.songLength = songLength;
    }


    @Override
    public String toString() {
        return "Song{" +
                ", name='" + name + '\'' +
                ", songCount=" + songCount +
                ", songLength=" + songLength +
                ", trackNumber='" + trackNumber + '\'' +
                '}';
    }
}

