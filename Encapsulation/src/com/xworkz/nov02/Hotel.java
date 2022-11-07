package com.xworkz.nov02;

public class Hotel {
	
	private String name;
	public String state;
	public String locatioon;
	private String ownerName;
	public int noOfChef;
	public boolean accomodation;
	public int availableRooms;
	public int floorInHotel;
	public String nearbyRailway;
	public String nearbyBusStand;
	public boolean roomService;
	
	
	public Hotel(String state, String locatioon, int noOfChef, boolean accomodation, int availableRooms,
			int floorInHotel, String nearbyRailway, String nearbyBusStand, boolean roomService) {
		super();
		this.state = state;
		this.locatioon = locatioon;
		this.noOfChef = noOfChef;
		this.accomodation = accomodation;
		this.availableRooms = availableRooms;
		this.floorInHotel = floorInHotel;
		this.nearbyRailway = nearbyRailway;
		this.nearbyBusStand = nearbyBusStand;
		this.roomService = roomService;
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
		System.out.println("State: "+ this.state);
		System.out.println("locatioon: "+ this.locatioon);
		System.out.println("noOfChef: "+ this.noOfChef);
		System.out.println("accomodation: "+ this.accomodation);
		System.out.println("availableRooms: "+ this.availableRooms);
		System.out.println("floorInHotel: "+ this.floorInHotel);
		System.out.println("nearbyRailway: "+ this.nearbyRailway);
		System.out.println("nearbyBusStand: "+ this.nearbyBusStand);
		System.out.println("roomService: "+ this.roomService);
		
	}
	
	

}
