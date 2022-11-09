package com.xworkz.inheritance.Nov9;

public class Satellite {
	public long distance;
	public String radius;
	
	public Satellite(long distance, String radius) {
		super();
		this.distance = distance;
		this.radius = radius;
	}
	
	public void display() {
		System.out.println("Distance : "+distance);
		System.out.println("Radius: "+radius);
	}

}
