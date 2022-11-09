package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.Nov8.DJSongs;

public class DJRunner {

	public static void main(String[] args) {
		DJSongs djsongs = new DJSongs("DJ Sounds Bengaluru", 30000, "5 Hr", "Mere Sapno Ki Rani", "Baby Ko Bass Pasand Hai");
		System.out.println("Sounds Name: "+ djsongs.soundsName);
		System.out.println("Price: "+djsongs.price);
		System.out.println("Hours: "+djsongs.hours);
		System.out.println("Song 1: "+djsongs.song1);
		System.out.println("Song 2:" +djsongs.song2);
	}
}
