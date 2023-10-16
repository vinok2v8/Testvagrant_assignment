package com.TestVagrant;

import java.util.List;

public class RecentlyPlayedStorePage {
	
	private RecentlyPlayedStorePage store;

    public RecentlyPlayedStorePage(RecentlyPlayedStorePage store) {
        this.store = store;
    }

    public RecentlyPlayedStorePage(int i) {
		// TODO Auto-generated constructor stub
	}

	public void addSong(String user, String song) {
        store.addSong(user, song);
    }

    public List<String> getRecentlyPlayed(String user) {
        return store.getRecentlyPlayed(user);
    }
	

}
