package com.xworkz.inheritance.equality;

public class Vehicle {
	
	private String type;
	private String brand;
	private double price;
	private int noOfWheels;
	private String fueltype;
	private String capacity;
	private boolean comfortable;
	private String color;
	private int releaseYear;
	private boolean airBag;
	
	public Vehicle() {
		super();
		System.out.println("Running default");
		
	}

	public Vehicle(String type, String brand, double price, int noOfWheels, String fueltype, String capacity,
			boolean comfortable, String color, int releaseYear, boolean airBag) {
		super();
		this.type = type;
		this.brand = brand;
		this.price = price;
		this.noOfWheels = noOfWheels;
		this.fueltype = fueltype;
		this.capacity = capacity;
		this.comfortable = comfortable;
		this.color = color;
		this.releaseYear = releaseYear;
		this.airBag = airBag;
	}
	
	
	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", brand=" + brand + ", price=" + price + ", noOfWheels=" + noOfWheels
				+ ", fueltype=" + fueltype + ", capacity=" + capacity + ", comfortable=" + comfortable + ", color="
				+ color + ", releaseYear=" + releaseYear + ", airBag=" + airBag + "]";
	}
	

	
	

	public boolean equals(Object obj) {
		if(obj instanceof Vehicle) {
			Vehicle cast=(Vehicle)obj;
			if (this.brand.equals(cast.brand)) {
				System.out.println("brand is same");
				return true;
			}
			else {
				System.out.println("brand is diff");
				return false;
			}
		}
		else {
			System.out.println("not Vehicle");
		}
		return false;
	}

}
