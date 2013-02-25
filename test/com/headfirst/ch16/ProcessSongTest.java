package com.headfirst.ch16;

import org.junit.Test;

/**
 * 
 * @author anirudh
 *
 */
public class ProcessSongTest {

	//TODO: Make it actual unit test with mocks
	@Test
	public void testWithList() {
		ProcessSongWithList process = new ProcessSongWithList();
		process.go();
	}
	
	@Test
	public void testWithTreeSet(){
		ProcessSongWithSet process = new ProcessSongWithSet();
		System.out.println("**************** Without duplicates ******************");
		process.go();
	}
	
}
