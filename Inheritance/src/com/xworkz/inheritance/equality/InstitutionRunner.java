package com.xworkz.inheritance.equality;

public class InstitutionRunner {
	public static void main(String[] args) {
		
		Institution institute = new Institution("Xworkz", "Bengaluru", "Omkar", "Akshara", "Vinay", 1000, 20, true, true, false);
		System.out.println(institute);
		
		Institution institute2 = new Institution("Xworkz", "Bengaluru", "omkar","Vinay", "Akshara", 999, 19, true, true, false);
		System.out.println(institute2);
		
		boolean Institutionn= institute.equals(institute2);
		System.out.println(Institutionn);
	}

}
