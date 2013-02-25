package com.headfirst.ch16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class ProcessSongWithSet {

	
	private Set<Song> songSet = new TreeSet<Song>();
	private static final String FILE_PATH ="/home/anirudh/PracticeCode/songList.txt";
	
	
	public void go(){
		readSongFromTxt();
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
		songSet.add(song);
	}
	private void display(){
		for (Song str : songSet) {
			System.out.println(str.getTitle()+" : "+str.getArtist());
		}
	}

}
