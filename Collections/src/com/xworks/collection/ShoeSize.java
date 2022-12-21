package com.xworks.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSize {
	public static void main(String[] args) {

		double size1 = 4;
		double size2 = 4.5;
		double size3 = 5;
		double size4 = 5.5;
		double size5 = 6;
		double size6 = 6.5;
		double size7 = 7;
		double size8 = 7.5;
		double size9 = 8;
		double size10 = 8.5;
		double size11 = 9;
		double size12 = 9.5;
		double size13 = 10;
		double size14 = 10.5;
		double size15 = 11;

		Collection<Double> shoe = new ArrayList<Double>();

		shoe.add(size1);
		shoe.add(size3);
		shoe.add(size2);
		shoe.add(size4);
		shoe.add(size5);
		shoe.add(size6);
		shoe.add(size7);
		shoe.add(size8);
		shoe.add(size9);
		shoe.add(size10);
		shoe.add(size11);
		shoe.add(size12);
		shoe.add(size13);
		shoe.add(size14);
		shoe.add(size15);

		System.out.println(shoe.size());
		System.out.println(shoe);

		for (Double element : shoe) {
			System.out.println(element);
		}

		System.out.println("-------Iterator-------");
		Iterator<Double> ref = shoe.iterator();
		while (ref.hasNext()) {
			Double element = ref.next();
			System.out.println(element);
		}

	}

}
