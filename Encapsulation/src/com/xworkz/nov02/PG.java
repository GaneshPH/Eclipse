package com.xworkz.nov02;

public class PG {
	
	private String pgName;
	private String locatioon;
	private int floorsInPg;
	private int roomsInPg;
	private int availableRooms;
	private double rentPrice;
	private String ownerName;
	public String nearbyBar;
	public String nearbyRailway;
	public boolean parkingLotInPG;
	public int noOfPeopleInRoom;
	
	
	public PG(String nearbyBar, String nearbyRailway, boolean parkingLotInPG, int noOfPeopleInRoom) {
		super();
		this.nearbyBar = nearbyBar;
		this.nearbyRailway = nearbyRailway;
		this.parkingLotInPG = parkingLotInPG;
		this.noOfPeopleInRoom = noOfPeopleInRoom;
	}


	public String getPgName() {
		return pgName;
	}


	public void setPgName(String pgName) {
		this.pgName = pgName;
	}


	public String getLocatioon() {
		return locatioon;
	}


	public void setLocatioon(String locatioon) {
		this.locatioon = locatioon;
	}


	public int getFloorsInPg() {
		return floorsInPg;
	}


	public void setFloorsInPg(int floorsInPg) {
		this.floorsInPg = floorsInPg;
	}


	public int getRoomsInPg() {
		return roomsInPg;
	}


	public void setRoomsInPg(int roomsInPg) {
		this.roomsInPg = roomsInPg;
	}


	public int getAvailableRooms() {
		return availableRooms;
	}


	public void setAvailableRooms(int availableRooms) {
		this.availableRooms = availableRooms;
	}


	public double getRentPrice() {
		return rentPrice;
	}


	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public void showoff() {
		System.out.println("NearbyBar: "+this.nearbyBar);
		System.out.println("NearbyRailway: "+this.nearbyRailway);
		System.out.println("ParkingLotInPG: "+this.parkingLotInPG);
		System.out.println("NoOfPeopleInRoom: "+this.noOfPeopleInRoom);
	}
	

}
