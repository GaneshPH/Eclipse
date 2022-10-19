package com.xworkz.copy.oct18.boot;

import com.xworkz.copy.oct18.*;

public class TrainRunner {

	public static void main(String[] args) {
		
		String[] viaRoutes = {"tumkur", "arasikere", "davanagere", "huballi"};
		String[] crossingTrains = {"vasco", "jan Shatabdi", "dadar", "nizamuddin"};
		int[] platformNoInJunctions = {1, 2, 3, 4};
		String[] tiffanInTrain = {"idli", "vada", "dosa", "palav"};
		String[] snacksInTrain = {"lays", "kurkure", "biscuit", "chikki"};
		String[] coachNumbers = {"D1", "D2", "D3", "D4"};
		
	Train train = new Train("InterCity", "bengaluru", "Dharwad", "12:30PM", "Everyday", viaRoutes, crossingTrains, platformNoInJunctions, tiffanInTrain, snacksInTrain, coachNumbers);
	train.display();
	
	
	}
	
}
