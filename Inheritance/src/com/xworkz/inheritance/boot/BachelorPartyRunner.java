package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.Nov8.BachelorPartySitting;

public class BachelorPartyRunner {
	
	public static void main(String[] args) {
		BachelorPartySitting bachelorPartySitting = new BachelorPartySitting("Bengaluru", 20, 40000, 10, "JD");
		System.out.println("Location: " +bachelorPartySitting.location);
		System.out.println("Number Of People: "+bachelorPartySitting.noOfPeoples);
		System.out.println("Amount Spent: "+bachelorPartySitting.totalAmountSpent);
		System.out.println("No. Of Bottles: "+bachelorPartySitting.noOfBottles);
		System.out.println("Brand Name: "+bachelorPartySitting.brandName);
		
	}

}
