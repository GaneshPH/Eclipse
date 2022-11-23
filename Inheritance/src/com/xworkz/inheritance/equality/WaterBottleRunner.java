package com.xworkz.inheritance.equality;

public class WaterBottleRunner {
	public static void main(String[] args) {
		
		WaterBottle waterBottle = new WaterBottle("Milton", 1, "blue", "blue", 120, true, "Flipkart", "Plastic", "Benagluru Dealers");
		System.out.println(waterBottle);
		
		WaterBottle waterBottle2 = new WaterBottle("Milton", 1, "blue", "white", 100, true, "Decathlon", "Plastic", "Decathon Deal");
		System.out.println(waterBottle2);
		
		boolean Bottle = waterBottle.equals(waterBottle2);
		System.out.println(Bottle);
	}

}
