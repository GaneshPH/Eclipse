package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.Nov8.MarriageInvitation;

public class InvitationRunner {
	
	public static void main(String[] args) {
		MarriageInvitation marriageinvitation = new MarriageInvitation("07/07/2007", "Bengaluru", "Sudashree Printers", "Yash", "Radhika");
		System.out.println("Date: "+marriageinvitation.date);
		System.out.println("Location: " +marriageinvitation.location);
		System.out.println("Printers: "+marriageinvitation.printingShopName);
		System.out.println("Groom Name: "+marriageinvitation.groomName);
		System.out.println("Bride name: "+marriageinvitation.brideName);
	}

}
