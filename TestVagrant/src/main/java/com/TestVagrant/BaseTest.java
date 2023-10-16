package com.TestVagrant;

import io.cucumber.java.Before;

public class BaseTest {
	protected RecentlyPlayedStorePage page;

    @Before
    public void setUp() {
        RecentlyPlayedStorePage store = new RecentlyPlayedStorePage(3); 
        
        page = new RecentlyPlayedStorePage(store);
    }

}
