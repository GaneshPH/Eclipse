package com.oct28.boot.things;

public class City {
	public Name name;
	public boolean capital;
	public double areaInSquareKilometers;
	
	
	
	public City(Name name, boolean capital, double areaInSquareKilometers) {
		super();
		this.name = name;
		this.capital = capital;
		this.areaInSquareKilometers = areaInSquareKilometers;
	}
	
	
	
	
	public void display() {
		System.out.println(this.areaInSquareKilometers);
		System.out.println(this.capital);
		if(name!=null) {
			this.name.display();
			System.out.println("display");
		}
		
		
	}

}
