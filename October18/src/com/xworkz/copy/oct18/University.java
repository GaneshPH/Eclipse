package com.xworkz.copy.oct18;

public class University {

	public String name;
	public String location;
	public long studentsInUniversity;
	public String VCname;
	public String[] colleges;
	public String[] collegesLocation;
	public String[] branchesInCollege;
	public int[] noOfStudentsInCollege;
	public String[] placementCompanies;
	public String[] placedStudents;
	
	
	public University(String name, String location, long studentsInUniversity, String vCname, String[] colleges,
			String[] collegesLocation, String[] branchesInCollege, int[] noOfStudentsInCollege,
			String[] placementCompanies, String[] placedStudents) 
	{
	
		this.name = name;
		this.location = location;
		this.studentsInUniversity = studentsInUniversity;
		this.VCname = vCname;
		this.colleges = colleges;
		this.collegesLocation = collegesLocation;
		this.branchesInCollege = branchesInCollege;
		this.noOfStudentsInCollege = noOfStudentsInCollege;
		this.placementCompanies = placementCompanies;
		this.placedStudents = placedStudents;
	}
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.location);
		System.out.println(this.studentsInUniversity);
		System.out.println(this.VCname);
		
		System.out.println(System.lineSeparator());
		System.out.println("colleges Under University");
		System.out.println("====================");
		for(int i=0; i<colleges.length; i++)
		{
			System.out.println(colleges[i]);
		}
		
		System.out.println(System.lineSeparator());
		System.out.println("colleges Location");
		System.out.println("====================");
		for(int i=0; i<collegesLocation.length; i++)
		{
			System.out.println(collegesLocation[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("branches In College");
		System.out.println("====================");
		for(int i=0; i<branchesInCollege.length; i++)
		{
			System.out.println(branchesInCollege[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("no Of Students In College");
		System.out.println("====================");
		for(int i=0; i<noOfStudentsInCollege.length; i++)
		{
			System.out.println(noOfStudentsInCollege[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("placement Companies");
		System.out.println("====================");
		for(int i=0; i<placementCompanies.length; i++)
		{
			System.out.println(placementCompanies[i]);
		}
		
		
		
		System.out.println(System.lineSeparator());
		System.out.println("placed Students");
		System.out.println("====================");
		for(int i=0; i<placedStudents.length; i++)
		{
			System.out.println(placedStudents[i]);
		}
	}
}
