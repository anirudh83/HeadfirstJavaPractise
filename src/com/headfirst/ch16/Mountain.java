package com.headfirst.ch16;

public class Mountain {
	
	private String name;
	private int height;
	
	public Mountain(String name,int height){
		this.name=name;
		this.height=height;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public String toString(){
		return name+ " "+height;
	}
	
}
