package com.TestVagrant;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class RecentlyPlayedStoreTest extends BaseTest{
    
	@Test
    public void testRecentlyPlayedStore() {
        page.addSong("User1", "S1");
        page.addSong("User1", "S2");
        page.addSong("User1", "S3");

        List<String> user1Playlist = page.getRecentlyPlayed("User1");
        assertEquals(Arrays.asList("S1", "S2", "S3"), user1Playlist);

        page.addSong("User1", "S4");
        user1Playlist = page.getRecentlyPlayed("User1");
        assertEquals(Arrays.asList("S2", "S3", "S4"), user1Playlist);

        page.addSong("User1", "S2");
        user1Playlist = page.getRecentlyPlayed("User1");
        assertEquals(Arrays.asList("S3", "S4", "S2"), user1Playlist);

        page.addSong("User1", "S1");
        user1Playlist = page.getRecentlyPlayed("User1");
        assertEquals(Arrays.asList("S4", "S2", "S1"), user1Playlist);
    }

}
