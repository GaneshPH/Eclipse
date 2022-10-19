package com.xworkz.copy.oct18.boot;

import com.xworkz.copy.oct18.*;

public class TeaSHopRunner {


	public static void main(String[] args) {
		
		int[] teaPrice = {5,10, 20, 50};
		int[] coffeeprice= {10, 20, 50, 100};
		int[] badamMilkPrice= {20, 30, 40, 50};
		String[] availableItems= {"tea", "coffee", "badamMilk", "juice", "panMasala"};
		String[] cigaratteBrands= {"lights", "king", "small", "players"};
		String[] typesOfTea= {"shuntiTea", "blacktea", "greenTea", "lemonTtea"};
		
		TeaSHop teaShop= new TeaSHop("rajTeaStall", "rajajinagar", teaPrice, coffeeprice, badamMilkPrice, availableItems, cigaratteBrands, "Raj", typesOfTea, true);
		teaShop.display();
		
		
		

	}

}
