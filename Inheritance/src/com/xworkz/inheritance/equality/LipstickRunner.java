package com.xworkz.inheritance.equality;

public class LipstickRunner {
	public static void main(String[] args) {
		Lipstick lipstick = new Lipstick("Lakme", 350, "Stick", "Matte", 10, "Pink", "2", "Asian Paints", "4.0", "12/12/2021");
		System.out.println(lipstick);
		
		Lipstick lipstick2 = new Lipstick("Lakme", 350, "Stick", "Matte", 15, "Skin", "3", "Amazon", "4.1","11/11/2022");
		System.out.println(lipstick2);
		
		boolean lipsticks = lipstick.equals(lipstick2);
				System.out.println(lipsticks);
	}

}
