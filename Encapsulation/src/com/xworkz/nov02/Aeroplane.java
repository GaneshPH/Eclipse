package com.xworkz.nov02;

public class Aeroplane {
	private String name;
	private String ownerName;
	public int number;
	public int noOfWheels;
	public String depLocation;
	public String depTime;
	public String endLocation;
	public String endLocationTime;
	public int capacity;
	public String pilotName;
	public String pilotNative;
	
	
	public Aeroplane(int number, int noOfWheels, String depLocation, String depTime,
			String endLocation, String endLocationTime, int capacity, String pilotName, String pilotNative) 
	{
		this.number = number;
		this.noOfWheels = noOfWheels;
		this.depLocation = depLocation;
		this.depTime = depTime;
		this.endLocation = endLocation;
		this.endLocationTime = endLocationTime;
		this.capacity = capacity;
		this.pilotName = pilotName;
		this.pilotNative = pilotNative;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void showoff() {
		System.out.println("number :"+ this.number);
		System.out.println("noOfWheels :"+ this.noOfWheels);
		System.out.println("depLocation :"+ this.depLocation);
		System.out.println("depTime :"+ this.depTime);
		System.out.println("endLocation :"+ this.endLocation);
		System.out.println("endLocationTime :"+ this.endLocationTime);
		System.out.println("capacity :"+ this.capacity);
		System.out.println("pilotName :"+ this.pilotName);
		System.out.println("pilotNative :"+ this.pilotNative);
		
		
	}

}
