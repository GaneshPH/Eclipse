package com.xworkz.inheritance.Nov8;

public class DJSongs extends DJ {
	
	public String song1;
	public String song2;
	
	public DJSongs(String soundsName, int price, String hours, String song1, String song2) {
		super(soundsName, price, hours);
		this.song1 = song1;
		this.song2 = song2;
	}
	
	

}
