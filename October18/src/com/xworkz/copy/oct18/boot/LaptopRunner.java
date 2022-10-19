package com.xworkz.copy.oct18.boot;

import com.xworkz.copy.oct18.*;

public class LaptopRunner {

	public static void main(String[] args) {
		String[] typesOfLaptop = {"Hp","Dell","Lenovo","Apple"};
		String[] typesOfOperatingSystems = {"Windows","Linux","MacOS"};
		String[] typesOfFolders = {"C drive","D drive","E drive","F drive"};
		double[] price = {50000.0, 60000.0, 70000.0, 80000.0};
		long[]   totalUserOtherCountry = {13458,794543,1455354};
		String[] countryNames = {"India","Russia","Japan"};
		
		Laptop laptop = new Laptop("Lenovo", "V15", "gottilla", 55000, true, typesOfLaptop, typesOfOperatingSystems, typesOfFolders, price, totalUserOtherCountry, countryNames);
		
		laptop.display();	
	}

}