package com.xworks.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCity {
	public static void main(String[] args) {
		String city1="Bengaluru";
		String city2="Pune";
		String city3="Hyderabad";
		String city4="Delhi";
		String city5="Chennai";
		
		Collection<String> metro = new ArrayList<String>();
	
		metro.add(city5);
		metro.add(city4);
		metro.add(city3);
		metro.add(city2);
		metro.add(city1);
		
		for (String element : metro) {
			System.out.println(metro);
		}

		System.out.println("-------Iterator-------");
		Iterator<String> ref = metro.iterator();
		while (ref.hasNext()) {
			String element = ref.next();
			System.out.println(element);
		}
		
	}

}
