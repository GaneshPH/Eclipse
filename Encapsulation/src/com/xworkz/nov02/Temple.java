package com.xworkz.nov02;

public class Temple {
	
	private String name;
	private String state;
	private String locatioon;
	private String godName;
	private int noOfPoojari;
	private boolean accomodation;
	private int availableRooms;
	private String buildingname;
	public String nearbyRailway;
	public String nearbyBusStand;
	public boolean dailyFood;
	
	
	public Temple(String nearbyRailway, String nearbyBusStand, boolean dailyFood) {
		super();
		this.nearbyRailway = nearbyRailway;
		this.nearbyBusStand = nearbyBusStand;
		this.dailyFood = dailyFood;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getLocatioon() {
		return locatioon;
	}


	public void setLocatioon(String locatioon) {
		this.locatioon = locatioon;
	}


	public String getGodName() {
		return godName;
	}


	public void setGodName(String godName) {
		this.godName = godName;
	}


	public int getNoOfPoojari() {
		return noOfPoojari;
	}


	public void setNoOfPoojari(int noOfPoojari) {
		this.noOfPoojari = noOfPoojari;
	}


	public boolean isAccomodation() {
		return accomodation;
	}


	public void setAccomodation(boolean accomodation) {
		this.accomodation = accomodation;
	}


	public int getAvailableRooms() {
		return availableRooms;
	}


	public void setAvailableRooms(int availableRooms) {
		this.availableRooms = availableRooms;
	}


	public String getBuildingname() {
		return buildingname;
	}


	public void setBuildingname(String buildingname) {
		this.buildingname = buildingname;
	}
	
	public void showoff() {
		System.out.println("NearbyRailway: "+this.nearbyRailway);
		System.out.println("NearbyBusStand: "+this.nearbyBusStand);
		System.out.println("dailyFood: "+this.dailyFood);
	}
	

}