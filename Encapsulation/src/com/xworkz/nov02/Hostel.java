package com.xworkz.nov02;

public class Hostel {
	
	private String hostelHame;
	public String state;
	public String locatioon;
	private boolean inCampus ;
	public String facilities;
	public int noOfRooms;
	public int floorInHostel;
	public String nearbyBusStand;
	public boolean hostelGate;
	public String wardenName;
	public boolean overallGood;
	
	
	public Hostel(String state, String locatioon, String facilities, int noOfRooms, int floorInHostel,
			String nearbyBusStand, boolean hostelGate, String wardenName, boolean overallGood) {
		super();
		this.state = state;
		this.locatioon = locatioon;
		this.facilities = facilities;
		this.noOfRooms = noOfRooms;
		this.floorInHostel = floorInHostel;
		this.nearbyBusStand = nearbyBusStand;
		this.hostelGate = hostelGate;
		this.wardenName = wardenName;
		this.overallGood = overallGood;
	}


	public String getHostelHame() {
		return hostelHame;
	}


	public void setHostelHame(String hostelHame) {
		this.hostelHame = hostelHame;
	}


	public boolean isInCampus() {
		return inCampus;
	}


	public void setInCampus(boolean inCampus) {
		this.inCampus = inCampus;
	}
	
	public void showoff() {
		
		System.out.println("State: "+this.state);
		System.out.println("locatioon: "+this.locatioon);
		System.out.println("facilities: "+this.facilities);
		System.out.println("noOfRooms: "+this.noOfRooms);
		System.out.println("floorInHostel: "+this.floorInHostel);
		System.out.println("nearbyBusStand: "+this.nearbyBusStand);
		System.out.println("hostelGate: "+this.hostelGate);
		System.out.println("wardenName: "+this.wardenName);
		System.out.println("overallGood: "+this.overallGood);
		
		
		
	}
	

}
