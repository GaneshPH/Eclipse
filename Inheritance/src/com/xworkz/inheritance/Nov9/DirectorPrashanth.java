package com.xworkz.inheritance.Nov9;

public class DirectorPrashanth extends Director{
	public String fullName;

	public DirectorPrashanth(String whenHeWriteStory, String recentMovie, String fullName) {
		super(whenHeWriteStory, recentMovie);
		this.fullName = fullName;
	}
	public void display() {
		super.display();
		System.out.println("Full Name: "+fullName);
	}
	

}
