package com.xworkz.inheritance.Nov9;

public class PoliticalParty {
	public String officeLocation;
	public String partyName;
	
	
	public PoliticalParty(String officeLocation, String partyName) {
		super();
		this.officeLocation = officeLocation;
		this.partyName = partyName;
	}
	

	public void display() {
		System.out.println("Location: "+officeLocation);
		System.out.println("PArty Name: "+partyName);
	}
}
