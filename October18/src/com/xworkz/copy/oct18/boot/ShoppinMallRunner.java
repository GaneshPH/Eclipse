package com.xworkz.copy.oct18.boot;

import com.xworkz.copy.oct18.*;

public class ShoppinMallRunner {

	public static void main(String[] args) {
		String[] name= {"Orion Mall", "Lulu Mall", "Dmart", "VegaCity"};
		String[] location= {"rajajinagar", "Binnipete", "Vijayanagar", "JP Nagar"};
		int[] shopsInMall= {10000, 2000, 1500, 1500}; 
		String[] typeOfShops= {"clothing", "Electronic Items", "Food", "Kitchen"};
		String[] nameOfShops= {"Puma", "Redmi", "Dominos", "Prestige"};
		String[] shopOwnerName= {"ABC", "DEF"};
		
		ShoppingMall shoppingmall = new ShoppingMall(name, location, shopsInMall, typeOfShops, nameOfShops, shopOwnerName, true, 5000, 500000000, true);
		shoppingmall.display();
		
	}

}
