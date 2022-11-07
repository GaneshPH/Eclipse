package com.xworkz.nov02;

public class BusAccessClass {
	
	public Bus bus;
	public void useBus(Bus bus) {
		bus.setName("Airavata Club Class");	
		System.out.println("Name: "+ bus.getName());
		
		bus.setOwnerName("Government");
		System.out.println("OwnerName: "+ bus.getOwnerName());
		
		bus.setNumber(5632);
		System.out.println("Number: "+ bus.getNumber());
		
	}
	

}
