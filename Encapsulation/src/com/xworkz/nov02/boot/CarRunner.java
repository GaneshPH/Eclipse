package com.xworkz.nov02.boot;

import com.xworkz.nov02.Car;
import com.xworkz.nov02.CarAccessClass;

public class CarRunner {
	
	public static void main(String[] args) {
		Car car = new Car("Bengaluru", 1400000, "Ganesh", "Petrol", 45, "TopEnd", "4+1");
		
		CarAccessClass kaar= new CarAccessClass();
		kaar.useCar(car);
		car.showoff();
	}

}
