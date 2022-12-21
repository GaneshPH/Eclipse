package com.xworkz.nov02;

public class Car {

	private String name;
	private String companyName;
	private int number;
	private boolean comfortable;
	public String showroomLocation;
	public long price;
	public String buyerName;
	public String fuelType;
	public int fuelcapacity;
	public String variant;
	public String noOfSeats;

	public Car(String showroomLocation, long price, String buyerName, String fuelType, int fuelcapacity, String variant,
			String noOfSeats) {
		super();
		this.showroomLocation = showroomLocation;
		this.price = price;
		this.buyerName = buyerName;
		this.fuelType = fuelType;
		this.fuelcapacity = fuelcapacity;
		this.variant = variant;
		this.noOfSeats = noOfSeats;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isComfortable() {
		return comfortable;
	}

	public void setComfortable(boolean comfortable) {
		this.comfortable = comfortable;
	}

	public void showoff() {
		System.out.println("showroomLocation :" + this.showroomLocation);
		System.out.println("price :" + this.price);
		System.out.println("buyerName :" + this.buyerName);
		System.out.println("fuelType :" + this.fuelType);
		System.out.println("fuelcapacity :" + this.fuelcapacity);
		System.out.println("variant :" + this.variant);
		System.out.println("noOfSeats :" + this.noOfSeats);

	}
}
