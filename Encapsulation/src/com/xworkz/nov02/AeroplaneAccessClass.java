package com.xworkz.nov02;

public class AeroplaneAccessClass {
	
	public Aeroplane aeroplane;
	
	public void useAeroplane(Aeroplane aeroplane) {
		aeroplane.setName("Spice Jet");
		System.out.println("name :" + aeroplane.getName());
		
		
		aeroplane.setOwnerName("ajay");
		System.out.println("OwnerName :"+ aeroplane.getOwnerName());
	}

}
