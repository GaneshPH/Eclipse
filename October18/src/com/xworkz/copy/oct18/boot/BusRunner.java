package com.xworkz.copy.oct18.boot;

import com.xworkz.copy.oct18.*;

public class BusRunner {

	public static void main(String[] args) {
		
		String[] viaRoutes = {"chitradurga", "davanagere"};
		String[] stops = {"chitradurga", "hiriyur", "davanagere", "haveri"};
		int[] platformNoInBusStand = {1, 2, 3, 4};
		String[] tiffanInBus = {"idli", "vada", "dosa", "palav"};
		String[] snacksInBus = {"lays", "kurkure", "biscuit", "chikki"};
		String[] seatNumbers = {"21", "25", "30", "31", "40"};
		
	Bus bus = new Bus("InterCity", "bengaluru", "Dharwad", "10:30PM", "Everyday", viaRoutes, stops, platformNoInBusStand, tiffanInBus, snacksInBus, seatNumbers);
	bus.display();

	}

}
