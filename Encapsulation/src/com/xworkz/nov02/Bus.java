package com.xworkz.nov02;

public class Bus {
	
	private String name;
	private String ownerName;
	private int number;
	public boolean luxury;
	public String depLocation;
	public String depTime;
	public String endLocation;
	public String endLocationTime;
	public int capacity;
	public String busEngine;
	public String busDepot;
	
	
	public Bus(boolean luxury, String depLocation, String depTime, String endLocation, String endLocationTime,
			int capacity, String busEngine, String busDepot) {
		super();
		this.luxury = luxury;
		this.depLocation = depLocation;
		this.depTime = depTime;
		this.endLocation = endLocation;
		this.endLocationTime = endLocationTime;
		this.capacity = capacity;
		this.busEngine = busEngine;
		this.busDepot = busDepot;
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


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}
	
	public void showoff() {
		System.out.println("number :"+ this.number);
		System.out.println("luxury :"+ this.luxury);
		System.out.println("depLocation :"+ this.depLocation);
		System.out.println("depTime :"+ this.depTime);
		System.out.println("endLocation :"+ this.endLocation);
		System.out.println("endLocationTime :"+ this.endLocationTime);
		System.out.println("capacity :"+ this.capacity);
		System.out.println("busEngine :"+ this.busEngine);
		System.out.println("busDepot :"+ this.busDepot);
	
	
	}
}
