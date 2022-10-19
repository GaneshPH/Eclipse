package com.xworkz.copy.oct18;

public class RailwayStation {
	public String name;
	public int noOfPlatforms;
	public boolean teaStall;
	public boolean displayBoards;
	public String[] trainsDaily;
	public String[] trainsName;
	public String[] noOfCoaches;
	public String[] capacity;
	public String[] trainTimings;
	public String[] nearbyRS;
	
	public RailwayStation(String name, int noOfPlatforms, boolean teaStall, boolean displayBoards, String[] trainsDaily, String[] trainsName, String[] noOfCoaches, String[] capacity, String[] trainTimings, String[] nearbyRS)
	{
		this.name=name;
		this.noOfPlatforms=noOfPlatforms;
		this.teaStall=teaStall;
		this.displayBoards=displayBoards;
		this.trainsDaily=trainsDaily;
		this.trainsName=trainsName;
		this.noOfCoaches=noOfCoaches;
		this.capacity=capacity;
		this.trainTimings=trainTimings;
		this.nearbyRS=nearbyRS;	
		
	}
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.noOfPlatforms);
		System.out.println(this.teaStall);
		System.out.println(this.displayBoards);
		
		System.out.println(System.lineSeparator());
		System.out.println("trains Daily");
		System.out.println("====================");
		for(int i=0; i<trainsDaily.length; i++)
		{
			System.out.println(trainsDaily[i]);
		}
		
		System.out.println(System.lineSeparator());
		System.out.println("trains Name");
		System.out.println("====================");
		for(int i=0; i<trainsName.length; i++)
		{
			System.out.println(trainsName[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("no Of Coaches");
		System.out.println("====================");
		for(int i=0; i<noOfCoaches.length; i++)
		{
			System.out.println(noOfCoaches[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("capacity");
		System.out.println("====================");
		for(int i=0; i<capacity.length; i++)
		{
			System.out.println(capacity[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("train Timings");
		System.out.println("====================");
		for(int i=0; i<trainTimings.length; i++)
		{
			System.out.println(trainTimings[i]);
		}
		
		
		
		System.out.println(System.lineSeparator());
		System.out.println("nearby RS");
		System.out.println("====================");
		for(int i=0; i<nearbyRS.length; i++)
		{
			System.out.println(nearbyRS[i]);
		}
				
	}

}
