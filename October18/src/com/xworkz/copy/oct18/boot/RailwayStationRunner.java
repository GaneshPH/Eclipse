package com.xworkz.copy.oct18.boot;

import com.xworkz.copy.oct18.*;

public class RailwayStationRunner {

	public static void main(String[] args) {
		
		String[] trainsDaily = {"vasco", "jan Shatabdi", "dadar", "nizamuddin"};
		String[] trainsName = {"vasco", "jan Shatabdi", "dadar", "nizamuddin"};
		String[] noOfCoaches = {"20", "22", "18", "17"};
		String[] capacity = {"5000", "6000", "4500", "4000"};
		String[] trainTimings = {"12:30", "14:30", "18:50", "23:50"};
		String[] nearbyRS = {"malleshwaram", "yeshwanthapur", "chikkabanavara", "tumkur"};
		
		RailwayStation railwayStation = new RailwayStation("KSR bengaluru", 15, true, true, trainsDaily, trainsName, noOfCoaches, capacity, trainTimings, nearbyRS);
		railwayStation.display();

	}

}
