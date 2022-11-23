package com.xworkz.inheritance.equality;

public class GodRunner {
	public static void main(String[] args) {
		God god = new God("Manjunatha","Dharmastala",1, "7:30AM", true, 1000000, "Gangotri",10, "Subramanya Road", "Dharmastala");
		System.out.println(god);
		
		God god2 = new God("Ganesha", "Soutadka", 1,"8:30AM", true,10000,"no", 5, "Mangalore", "Soutadka");
		System.out.println(god2);
		
		boolean devru=god.equals(god2);
		System.out.println(devru);
	}

}
