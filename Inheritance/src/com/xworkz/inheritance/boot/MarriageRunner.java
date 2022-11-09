package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.Nov8.ArrangeMarriage;

public class MarriageRunner {

	public static void main(String[] args) {
		ArrangeMarriage	arrangemarriage = new ArrangeMarriage("Bengaluru", 10000, "12/10/2022", "Mamata", "Omkar" );
		
		System.out.println("Marriage Location: " + arrangemarriage.marriageLocation);
		System.out.println("Attended people: " +arrangemarriage.attendedPeoples);
		System.out.println("Date: "+arrangemarriage.date);
		System.out.println("Groom Name: "+arrangemarriage.groomName);
		System.out.println("Bride Name: "+arrangemarriage.brideName);
	}
	
}
