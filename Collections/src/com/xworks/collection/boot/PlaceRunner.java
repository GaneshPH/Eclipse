package com.xworks.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworks.collection.PlaceDTO;

public class PlaceRunner {
	public static void main(String[] args) {
		PlaceDTO placeDTO1 = new PlaceDTO("Byadgi",581106, "RedChilli");
		
		PlaceDTO placeDTO2 = new PlaceDTO("Haveri", 581110, "Yalakki");
		
		PlaceDTO placeDTO3 = new PlaceDTO("Byadgi", 0, null);
		
		boolean equals = placeDTO1.equals(placeDTO3);
		System.out.println(placeDTO1.getName().equals(placeDTO3.getName()));
		Collection<PlaceDTO>places = new ArrayList<PlaceDTO>();
		
		places.add(placeDTO1);
		places.add(placeDTO2);
		boolean contains = places.contains(placeDTO3);
		System.out.println("Contains: "+contains);
	}


}
