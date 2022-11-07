package com.xworkz.nov02;

public class HotelAccessClass {
	
	public Hotel hotel;
	public void useHotel(Hotel hotel) {
		
		hotel.setName("Shanti Sagar");
		System.out.println("Name: "+hotel.getName());
		
		hotel.setOwnerName("Sagar");
		System.out.println("Owner Name: "+hotel.getOwnerName());
	}

}
