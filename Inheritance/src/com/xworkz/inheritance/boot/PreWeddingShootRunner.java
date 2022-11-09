package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.Nov8.PreWeddingShootDestiny;

public class PreWeddingShootRunner {
	
	public static void main(String[] args) {
		
		PreWeddingShootDestiny preweddingshootdestiny = new PreWeddingShootDestiny("bengaluru","Aryan", 805050405, "Kerala", "Kashmir");
		System.out.println("Photographer Location: "+preweddingshootdestiny.location);
		System.out.println("PhtotgrapherName: "+preweddingshootdestiny.PhotographerName);
		System.out.println("Contact Number: "+preweddingshootdestiny.contactNumber);
		System.out.println("Destiny 1 : "+preweddingshootdestiny.destiny1);
		System.out.println("Destiny 2 :"+preweddingshootdestiny.destiny2);
	}

}
