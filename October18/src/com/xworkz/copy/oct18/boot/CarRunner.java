package com.xworkz.copy.oct18.boot;

import com.xworkz.copy.oct18.*;

public class CarRunner {
	
	public static void main (String[] args)
	{
		String[] carName= {"Fortuner", "Innova", "Urban Cruiser", "VellFire"};
		int[] yearOfManufactured= {2020, 2022, 2022, 2020};
		int[] carPrice= {3200000, 2500000, 3000000, 9999999};
		String[] carVarient= {"Top", "Middle", "base", "Top"};
		String[] maxSpeeed= {"200", "200", "180", "250"};
		String[] carNumber= {"KA01MZ8055", "KA01MZ8056", "KA01MZ8057", "KA01MZ8058"};
		
		Car car = new Car(carName, yearOfManufactured, carPrice, carVarient, maxSpeeed, carNumber, "Bngaluru", "Toyota", 6, 4);
		car.display();
		
	}
	

}
