package com.java401.AlbumCookies401;

import com.java401.AlbumCookies401.models.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
class AlbumCookies401ApplicationTests {

	@Test
	public void testConstructorAndGetters() {
		// Arrange
		String title = "Sample Album";
		String artist = "Test Artist";
		int songCount = 10;
		int songLength = 300;
		String imageURL = "http://example.com/album-image.jpg";

		// Act
		Album album = new Album(title, artist, songCount, songLength);

		// Assert
		assertEquals(title, album.getTitle());
		assertEquals(artist, album.getArtist());
		assertEquals(songCount, album.getSongCount());
		assertEquals(songLength, album.getSongLength());
		assertNull(album.getImageURL());
		System.out.println(album);
	}

	@Test
	public void testSettersAndGetters() {
		// Arrange
		Album album = new Album("Old Album", "Old Artist", 5, 250);

		// Act
		album.setTitle("New Album");
		album.setArtist("New Artist");
		album.setSongCount(8);
		album.setSongLength(320);
		album.setImageURL("http://new-example.com/album-image.jpg");

		// Assert
		assertEquals("New Album", album.getTitle());
		assertEquals("New Artist", album.getArtist());
		assertEquals(8, album.getSongCount());
		assertEquals(320, album.getSongLength());
		assertEquals("http://new-example.com/album-image.jpg", album.getImageURL());

	}
}
