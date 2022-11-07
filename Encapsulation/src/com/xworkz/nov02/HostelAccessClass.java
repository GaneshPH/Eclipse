package com.xworkz.nov02;

public class HostelAccessClass {
	
	public Hostel hostel;
	public void useHostel(Hostel hostel) {
		
		hostel.setHostelHame("KIT BoysHostel");
		System.out.println("Hostel Name: "+hostel.getHostelHame());
		
		hostel.setInCampus(true);
		System.out.println("In Campus: "+hostel.isInCampus());
	}

}
