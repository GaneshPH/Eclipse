package com.xworks.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animal {
	public static void main(String[] args) {

		String animal1 = "Tiger";
		String animal2 = "Lion";
		String animal3 = "Dog";
		String animal4 = "Cat";
		String animal5 = "Rabbit";
		String animal6 = "Monkey";
		String animal7 = "Elephant";
		String animal8 = "Horse";
		String animal9 = "Sheep";
		String animal10 = "Donkey";

		Collection<String> animal = new ArrayList<String>();

		animal.add(animal1);
		animal.add(animal2);
		animal.add(animal3);
		animal.add(animal4);
		animal.add(animal5);
		animal.add(animal6);
		animal.add(animal7);
		animal.add(animal8);
		animal.add(animal9);
		animal.add(animal10);

		System.out.println(animal.size());
		System.out.println(animal);

		// for each
		for (String element : animal) {
			System.out.println(element);
		}

		System.out.println("-------Iterator-------");
		Iterator<String> ref = animal.iterator();
		while (ref.hasNext()) {
			String element = ref.next();
			System.out.println(element);
		}

	}

}
