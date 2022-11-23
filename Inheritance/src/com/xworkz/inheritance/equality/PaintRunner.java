package com.xworkz.inheritance.equality;

public class PaintRunner {

	public static void main(String[] args) {
		Paint paint=new Paint("Asian Paints", 350, 1, "Water Paint", "White", true, "Amazon", true, "12/12/2022", "Box");
		System.out.println(paint);
		
		Paint paint2=new Paint("Asian Paints", 351, 1, "water Paint", "blue", true, "Berger", true, "12/11/2021", "cover");
		System.out.println(paint2);
		
		boolean brand=paint.equals(paint2);
		System.out.println(brand);
		
	
		
	}
}
