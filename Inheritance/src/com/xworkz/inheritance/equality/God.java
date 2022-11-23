package com.xworkz.inheritance.equality;

public class God {
	private String godName;
	private String location;
	private int noOfGods;
	private String poojeTimings;
	private boolean powerFull;
	private int dailyVisitors;
	private String accomodationInTemple;
	private int noOfPoojaris;
	private String nearByRailwayStation;
	private String nearyByBusStand;
	
	public God(String godName, String location, int noOfGods, String poojeTimings, boolean powerFull, int dailyVisitors,
			String accomodationInTemple, int noOfPoojaris, String nearByRailwayStation, String nearyByBusStand) {
		super();
		this.godName = godName;
		this.location = location;
		this.noOfGods = noOfGods;
		this.poojeTimings = poojeTimings;
		this.powerFull = powerFull;
		this.dailyVisitors = dailyVisitors;
		this.accomodationInTemple = accomodationInTemple;
		this.noOfPoojaris = noOfPoojaris;
		this.nearByRailwayStation = nearByRailwayStation;
		this.nearyByBusStand = nearyByBusStand;
	}

	public God() {
		super();
	}

	@Override
	public String toString() {
		return "God [godName=" + godName + ", location=" + location + ", noOfGods=" + noOfGods + ", poojeTimings="
				+ poojeTimings + ", powerFull=" + powerFull + ", dailyVisitors=" + dailyVisitors
				+ ", accomodationInTemple=" + accomodationInTemple + ", noOfPoojaris=" + noOfPoojaris
				+ ", nearByRailwayStation=" + nearByRailwayStation + ", nearyByBusStand=" + nearyByBusStand + "]";
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Paint) {
			God cast=(God)obj;
			if (this.godName.equals(cast.godName) 
					&& this.location.equals(cast.location) 
					&& this.noOfGods==(cast.noOfGods)) {
				System.out.println("Location, God Name and Number OF Gods is same ");
				return true;
			}
			else {
				System.out.println("Bere Bere");
				return false;
			
		}
	
		}
		return false;
	}
	
	

}
