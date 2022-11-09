package com.xworkz.inheritance.Nov9;

public class SatelliteMoon extends Satellite{
	public String shape;

	public SatelliteMoon(long distance, String radius, String shape) {
		super(distance, radius);
		this.shape = shape;
	}
	
	public void display() {
		super.display();
		System.out.println("Shape: "+shape);
	}

}
