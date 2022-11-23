package com.xworkz.inheritance.equality;

public class VehicleRunner {
	
	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle("bike", "RE", 284000, 2, "petrol", "2", true, "grey", 2022, false);
		System.out.println(vehicle);
		
		Vehicle vehicle2=new Vehicle("car", "Nissan", 600000, 4, "Diesel", "5", true, "white", 2022, true);
		System.out.println(vehicle2);
		
		
		boolean brand=vehicle.equals(vehicle2);
		System.out.println(brand);
	}

}
