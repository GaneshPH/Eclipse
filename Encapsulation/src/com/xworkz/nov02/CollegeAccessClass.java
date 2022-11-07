package com.xworkz.nov02;

public class CollegeAccessClass {
	
	public College college;
	public void useCollege(College college) {
		
		college.setName("KIT");
		System.out.println("Name: "+college.getName());
		
		college.setLocation("Tiptur");
		System.out.println("Location:" +college.getLocation());
		
		college.setArea("Sri Sharada Nagara");
		System.out.println("Area: "+ college.getArea());
		
		college.setUniversity("VTU, Belagavi");
		System.out.println("University: "+college.getUniversity());
		
		college.setNumberOfStudents(2500);
		System.out.println("Number Of Students: " +college.getNumberOfStudents());
		
		college.setAny2Branches("Mech, CS");
		System.out.println("Any 2 Branches: "+ college.getAny2Branches());
		
		college.setDegreeCollege(true);
		System.out.println("Degree College: "+ college.isDegreeCollege());
		
	}

}
