package com.headfirst.ch16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author anirudh
 *
 */
public class ProcessSongWithList {
	
	private List<Song> songList = new ArrayList<Song>();
	private static final String FILE_PATH ="/home/anirudh/PracticeCode/songList.txt";
	
	
	public void go(){
		readSongFromTxt();
		Collections.sort(songList);
		System.out.println("*******Sorted by Title********");
		display();
		System.out.println("*********Sorted by Artist name******");
		
		Comparator<Song> artistNameComparator = new Comparator<Song>(){
			@Override
			public int compare(Song s1, Song s2) {
				return s1.getArtist().compareTo(s2.getArtist());
			}
		};
		Collections.sort(songList,artistNameComparator);
		display();
		System.out.println("**********Now without duplicates********");
		Set<Song> songSet = new HashSet<Song>();
		songSet.addAll(songList);
		display();
		
		
	}
	private void readSongFromTxt(){
		File file = new File(FILE_PATH);
		FileReader fileReader;
		try {
			fileReader = new FileReader(file);
			BufferedReader inputReader = new BufferedReader(fileReader);
			String line;
			while((line = inputReader.readLine())!=null){
				addSong(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found!!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Cant Read File!!!");
			e.printStackTrace();
		}
		
		
	}
	private void addSong(String line){
		String[] split = line.split("/");
		Song song = new Song(split[0],split[1],split[2],split[3]);
		songList.add(song);
	}
	
	private void display(){
		for (Song str : songList) {
			System.out.println(str.getTitle()+" : "+str.getArtist());
		}
	}
}
