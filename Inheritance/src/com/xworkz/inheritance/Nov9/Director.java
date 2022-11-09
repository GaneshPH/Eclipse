package com.xworkz.inheritance.Nov9;

public class Director {
	public String whenHeWriteStory;
	public String recentMovie;
	
	
	public Director(String whenHeWriteStory, String recentMovie) {
		super();
		this.whenHeWriteStory = whenHeWriteStory;
		this.recentMovie = recentMovie;
	}
	
	public void display() {
		System.out.println("When He Write Story : "+whenHeWriteStory);
		System.out.println("Recent Movie : "+recentMovie);
	}
	

}
