package com.xworks.collection;

import java.util.TreeSet;

public class Bike {
	public static void main(String[] args) {

		String bike1 = "Himalayan";
		String bike2 = "Ninja 300";
		String bike3 = "Ninja 600";
		String bike4 = "ZX 10R";
		String bike5 = "Splender+";
		String bike6 = "HF Deluxe";
		String bike7 = "R15";
		String bike8 = "MT 15";
		String bike9 = "Bullet 350";
		String bike10 = "Activa 6G";
		String bike11 = "Duke 250";
		String bike12 = "RC 390";
		String bike13 = "Duke 390";
		String bike14 = "TVS XL";
		String bike15 = "Apache";

		TreeSet<String> collections = new TreeSet();

		collections.add(bike1); // passing ref
		collections.add(bike2);
		collections.add(bike3);
		collections.add(bike4);
		collections.add(bike5);
		collections.add(bike6);
		collections.add(bike7);
		collections.add(bike8);
		collections.add(bike9);
		collections.add(bike10);
		collections.add(bike11);
		collections.add(bike12);
		collections.add(bike13);
		collections.add(bike14);
		collections.add(bike15);

		System.out.println(collections.size());

		collections.clear();
		System.out.println("After clearing");

		System.out.println(collections.size());

	}

}
