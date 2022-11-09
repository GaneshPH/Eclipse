package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.Nov8.CateringWedding;

public class CateringRunner {
	public static void main(String[] args) {
		CateringWedding cateringWedding = new CateringWedding("Udupi", "Brahmin", true, 808800550);
		System.out.println("Caterer Name: "+cateringWedding.catererName);
		System.out.println("Food Style: "+cateringWedding.style);
		System.out.println("Food Is Tasty: "+cateringWedding.tasteIsGood);
		System.out.println("Contact Number: "+cateringWedding.contactNumber);
		
				
	}

}
