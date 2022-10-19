package com.xworkz.copy.oct18.boot;

import com.xworkz.copy.oct18.Pizza;

public class PizzaRunner {

	public static void main(String[] args) {
		String[] typesOfPizza= {"mushroom", "corn", "chicken", "onion"};
		String[] ingredients= {"Maida", "SOS", "onion", "tomato"};
		String[] topings= {"origano", "ChilliFlakes", "Sos"};
		int[] price= {99, 199, 299, 399};
		char[] sizes= {'M', 'S', 'L'};
		String[] availability= {"Dominos", "PizzaHut", "Swiggy", "Zomato"};
		
		Pizza pizza = new Pizza("Pizza", 600, true, "rajajinagar", typesOfPizza, ingredients, topings, price, sizes, availability);
		pizza.display();
		
	}

}
