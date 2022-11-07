package com.xworkz.nov02;

public class Train {
	
	private String name;
	private String color;
	private int number;
	private boolean AC;
	private String depLocation;
	private String depTime;
	public String endLocation;
	public String endLocationTime;
	public int numberOfCoaches;
	public int numberOfStops;
	public boolean onlineBooking;
	
	
	public Train(String endLocation, String endLocationTime, int numberOfCoaches, int numberOfStops,
			boolean onlineBooking) {
		super();
		this.endLocation = endLocation;
		this.endLocationTime = endLocationTime;
		this.numberOfCoaches = numberOfCoaches;
		this.numberOfStops = numberOfStops;
		this.onlineBooking = onlineBooking;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public boolean isAC() {
		return AC;
	}


	public void setAC(boolean aC) {
		AC = aC;
	}


	public String getDepLocation() {
		return depLocation;
	}


	public void setDepLocation(String depLocation) {
		this.depLocation = depLocation;
	}


	public String getDepTime() {
		return depTime;
	}


	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}
	
	public void showoff() {
		System.out.println("EndLocation:" + this.endLocation);
		System.out.println("EndLocationTime:" + this.endLocationTime);
		System.out.println("numberOfCoaches:" + this.numberOfCoaches);
		System.out.println("numberOfStops:" + this.numberOfStops);
		System.out.println("onlineBooking:" + this.onlineBooking);
	}
	

}
