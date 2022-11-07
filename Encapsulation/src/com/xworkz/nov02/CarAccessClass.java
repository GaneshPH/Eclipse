package com.xworkz.nov02;

public class CarAccessClass {

	public Car car;
	public void useCar(Car car) {
		
		car.setName("Nexon");
		System.out.println("Name: " +car.getName());
		
		car.setNumber(8055);
		System.out.println("Number: " +car.getNumber());
		
		car.setCompanyName("TATA");
		System.out.println("Company Name: " + car.getCompanyName());
		
		car.setComfortable(true);
		System.out.println("Comfortbale: "+ car.isComfortable());
		
	
	}
}
