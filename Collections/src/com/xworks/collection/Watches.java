package com.xworks.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watches {
	public static void main(String[] args) {
		String watch1="Rolex";
		String watch2="Police";
		String watch3="Armani";
		String watch4="Fastrack";
		String watch5="Boat";
		
		Collection<String> watch = new ArrayList<String>();
		
		watch.add(watch1);
		watch.add(watch2);
		watch.add(watch3);
		watch.add(watch4);
		watch.add(watch5);

		System.out.println(watch.size());
		System.out.println(watch);
		
		for(String element:watch) {
			System.out.println(element);
		}
		
		System.out.println("-------Iterator-------");
		Iterator<String> ref=watch.iterator();
		while(ref.hasNext()) {
			String element = ref.next();
			System.out.println(element);
		}
	}

}
