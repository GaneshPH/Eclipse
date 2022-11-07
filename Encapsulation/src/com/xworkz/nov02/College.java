package com.xworkz.nov02;

public class College {
	private String name;
	private String location;
	private int numberOfStudents;
	private boolean degreeCollege;
	private String area;
	private String any2Branches;
	private String university;
	public boolean transportFacility;
	public int numberOfBranches;
	public int numberOfBuildings;
	public boolean placements;
	
	
	public College(boolean transportFacility, int numberOfBranches, int numberOfBuildings, boolean placements) {
		super();
		this.transportFacility = transportFacility;
		this.numberOfBranches = numberOfBranches;
		this.numberOfBuildings = numberOfBuildings;
		this.placements = placements;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getNumberOfStudents() {
		return numberOfStudents;
	}


	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}


	public boolean isDegreeCollege() {
		return degreeCollege;
	}


	public void setDegreeCollege(boolean degreeCollege) {
		this.degreeCollege = degreeCollege;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getAny2Branches() {
		return any2Branches;
	}


	public void setAny2Branches(String any2Branches) {
		this.any2Branches = any2Branches;
	}


	public String getUniversity() {
		return university;
	}


	public void setUniversity(String university) {
		this.university = university;
	}

	public void showoff() {
		System.out.println("TransportFacility: "+this.transportFacility);
		System.out.println("numberOfBranches: "+this.numberOfBranches);
		System.out.println("numberOfBuildings: "+this.numberOfBuildings);
		System.out.println("placements: "+this.placements);
	}
	
}
