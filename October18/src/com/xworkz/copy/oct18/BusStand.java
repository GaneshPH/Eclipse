package com.xworkz.copy.oct18;

public class BusStand {
	
	public String name;
	public int noOfPlatforms;
	public boolean teaStall;
	public boolean displayBoards;
	public String[] busDailyatPF;
	public String[] busnumber;
	public String[] busDepot;
	public String[] capacity;
	public String[] busTimings;
	public String[] busTypes;
	
	public BusStand(String name, int noOfPlatforms, boolean teaStall, boolean displayBoards, String[] busDailyatPF, String[] busnumber, String[] busDepot, String[] capacity, String[] busTimings, String[] busTypes)
	{
		this.name=name;
		this.noOfPlatforms=noOfPlatforms;
		this.teaStall=teaStall;
		this.displayBoards=displayBoards;
		this.busDailyatPF=busDailyatPF;
		this.busnumber=busnumber;
		this.busDepot=busDepot;
		this.capacity=capacity;
		this.busTimings=busTimings;
		this.busTypes=busTypes;	
	}
	

	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.noOfPlatforms);
		System.out.println(this.teaStall);
		System.out.println(this.displayBoards);
		
		System.out.println(System.lineSeparator());
		System.out.println("bus Daily at PF");
		System.out.println("====================");
		for(int i=0; i<busDailyatPF.length; i++)
		{
			System.out.println(busDailyatPF[i]);
		}
		
		System.out.println(System.lineSeparator());
		System.out.println("bus number");
		System.out.println("====================");
		for(int i=0; i<busnumber.length; i++)
		{
			System.out.println(busnumber[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("bus Depot");
		System.out.println("====================");
		for(int i=0; i<busDepot.length; i++)
		{
			System.out.println(busDepot[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("capacity");
		System.out.println("====================");
		for(int i=0; i<capacity.length; i++)
		{
			System.out.println(capacity[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("bus Timings");
		System.out.println("====================");
		for(int i=0; i<busTimings.length; i++)
		{
			System.out.println(busTimings[i]);
		}
		
		
		
		System.out.println(System.lineSeparator());
		System.out.println("busTypes");
		System.out.println("====================");
		for(int i=0; i<busTypes.length; i++)
		{
			System.out.println(busTypes[i]);
		}
				
	}
	

}
