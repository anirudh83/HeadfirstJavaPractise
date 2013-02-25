package com.headfirst.ch16;

/**
 * 
 * @author anirudh
 *
 */
public class Song implements Comparable<Song>{
	
	private String title;
	private String artist;
	private String album;
	private String rating;
	
	public Song(String title,String artist,String album,String rating){
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.rating=rating;
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
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString(){
		return this.title;
	}

	@Override
	public int compareTo(Song s) {
		return this.getTitle().compareTo(s.getTitle());
	}
	
	@Override
	public boolean equals(Object o){
		return this.getTitle().equals(((Song)o).getTitle());
	}
	
	@Override
	public int hashCode(){
		return this.getTitle().hashCode();
	}
	
}
