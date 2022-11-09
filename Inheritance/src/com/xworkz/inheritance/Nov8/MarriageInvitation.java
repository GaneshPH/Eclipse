package com.xworkz.inheritance.Nov8;

public class MarriageInvitation extends Invitation {
	
	public String groomName;
	public String brideName;
	
	
	public MarriageInvitation(String date, String location, String printingShopName, String groomName,
			String brideName) {
		super(date, location, printingShopName);
		this.groomName = groomName;
		this.brideName = brideName;
	}
	
	
	
	}

