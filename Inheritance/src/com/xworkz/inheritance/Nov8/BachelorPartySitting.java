package com.xworkz.inheritance.Nov8;

public class BachelorPartySitting extends BhachelorParty{
	
	public int noOfBottles;
	public String brandName;
	
	
	public BachelorPartySitting(String location, int noOfPeoples, double totalAmountSpent, int noOfBottles,
			String brandName) {
		super(location, noOfPeoples, totalAmountSpent);
		this.noOfBottles = noOfBottles;
		this.brandName = brandName;
	}
	
}
