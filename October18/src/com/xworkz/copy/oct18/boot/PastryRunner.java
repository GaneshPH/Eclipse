package com.xworkz.copy.oct18.boot;

import com.xworkz.copy.oct18.*;


public class PastryRunner {

	public static void main(String[] args) {
		String[] ingredients= {"flour", "oil", "egg", "milk"};
		String[] madeBy= {"bakery people", "home", "cake shop"};
		int[] price= {41, 40, 35, 20};
		String[] flavour= {"Strawbery", "Vanella", "ButterScotch", "Black Current"};
		String[] colour= {"pink", "white", "light Yellow", "Violet"};
		
		Pastry pastry = new Pastry("Pastry", "Ganesh", "Reactangle", 100, 4, ingredients, madeBy, price, flavour, colour);
				pastry.display();
	}

}
