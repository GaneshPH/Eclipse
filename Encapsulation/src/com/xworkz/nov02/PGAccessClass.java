package com.xworkz.nov02;

public class PGAccessClass {
	
	public PG pg;
	public void usePG(PG pg) {
		pg.setPgName("VR PG");
		System.out.println("Pg Name : "+pg.getPgName());
		
		pg.setLocatioon("Gayatri Nagar");
		System.out.println("Location: "+pg.getLocatioon());
		
		pg.setOwnerName("Venkat");
		System.out.println("Owner Name: " +pg.getOwnerName());
		
		pg.setAvailableRooms(7);
		System.out.println("Available Rooms: "+pg.getAvailableRooms());
		
		pg.setFloorsInPg(6);
		System.out.println("Floors In PG: "+pg.getFloorsInPg());
		
		pg.setRoomsInPg(30);
		System.out.println("Rooms In Pg: "+pg.getRoomsInPg());
		
		pg.setRentPrice(6000.00);
		System.out.println("Rent Price: "+pg.getRentPrice());
		
	}

}
