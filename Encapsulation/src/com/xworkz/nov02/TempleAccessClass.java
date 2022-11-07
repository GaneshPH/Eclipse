package com.xworkz.nov02;

public class TempleAccessClass {
	
	public Temple temple;
	public void useTemple(Temple temple) {
		
		temple.setName("Dharmastala Manjunatha Devastana");
		System.out.println("Name: "+temple.getName());
		
		temple.setState("Karnataka");
		System.out.println("State: "+temple.getState());
		
		temple.setLocatioon("Dharmastala");
		System.out.println("Location: "+temple.getLocatioon());
		
		temple.setGodName("Manjunatha");
		System.out.println("God Name: "+temple.getGodName());
		
		temple.setNoOfPoojari(100);
		System.out.println("Number Of Poojari:"+temple.getNoOfPoojari());
		
		temple.setAccomodation(true);
		System.out.println("Accomodation: " +temple.isAccomodation());
		
		temple.setAvailableRooms(50);
		System.out.println("Available Rooms: "+temple.getAvailableRooms());
		
		temple.setBuildingname("Gangotri");
		System.out.println("Bilading NAme: "+temple.getBuildingname());
		
	}
	
	

}
