package com.xworkz.nov02.boot;

import com.xworkz.nov02.Train;
import com.xworkz.nov02.TrainAccessClass;

public class TrainRunner {

	public static void main(String[] args) {
		
		Train train = new Train("Hubballi", "1:30PM", 15, 10, true);
		TrainAccessClass rail=new TrainAccessClass() ;
		rail.useTrain(train);
		train.showoff();

	}
	
}
