package com.xworkz.inheritance.equality;

public class Institution {
	private String name;
	private String location;
	private String founder;
	private String hr1;
	private String hr2;
	private int totalStudents;
	private int totalTrainees;
	private boolean placements;
	private boolean dailyPresentation;
	private boolean parkingLot;
	
	public Institution() {
		super();
	}

	public Institution(String name, String location, String founder, String hr1, String hr2, int totalStudents,
			int totalTrainees, boolean placements, boolean dailyPresentation, boolean parkingLot) {
		super();
		this.name = name;
		this.location = location;
		this.founder = founder;
		this.hr1 = hr1;
		this.hr2 = hr2;
		this.totalStudents = totalStudents;
		this.totalTrainees = totalTrainees;
		this.placements = placements;
		this.dailyPresentation = dailyPresentation;
		this.parkingLot = parkingLot;
	}

	@Override
	public String toString() {
		return "Institution [name=" + name + ", location=" + location + ", founder=" + founder + ", hr1=" + hr1
				+ ", hr2=" + hr2 + ", totalStudents=" + totalStudents + ", totalTrainees=" + totalTrainees
				+ ", placements=" + placements + ", dailyPresentation=" + dailyPresentation + ", parkingLot="
				+ parkingLot + "]";
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Institution) {
			Institution cast=(Institution)obj;
			if (this.name.equals(cast.name) 
					&& this.location.equals(cast.location)
					&&this.founder.equals(cast.founder)
					&&this.hr1.equals(cast.hr1)
					&&this.hr2.equals(cast.hr2)) {
				System.out.println("name, location,  founder, hr1, and hr2 is same ");
				return true;
			}
			else {
				System.out.println("Bere Bere");
	
				return false;
			
		}
	
		}
		return false;
	}
	
	

}
