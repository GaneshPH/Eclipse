package com.xworkz.copy.oct18;

public class Bus {
	public String name;
	public String from;
	public String to;
	public String departure;
	public String date;
	public String[] viaRoutes;
	public String[] stops;
	public int[] platformNoInBusStand;
	public String[] tiffanInBus;
	public String[] snacksInBus;
	public String[] seatNumbers;
	
	public Bus(String name, String from, String to, String departure, String date, String[] viaRoutes, String[] stops, int[] platformNoInBusStand, String[] tiffanInBus,  String[] snacksInBus, String[] seatNumbers)
	{
		this.name=name;
		this.from=from;
		this.to=to;
		this.departure=departure;
		this.viaRoutes=viaRoutes;
		this.stops=stops;
		this.platformNoInBusStand=platformNoInBusStand;
		this.tiffanInBus=tiffanInBus;
		this.snacksInBus=snacksInBus;
		this.seatNumbers=seatNumbers;	
	}
	
	public void display()
	{
	System.out.println(this.name);
	System.out.println(this.from);
	System.out.println(this.to);
	System.out.println(this.departure);
	
	System.out.println(System.lineSeparator());
	System.out.println("Via Routes");
	System.out.println("====================");
	for(int i=0; i<viaRoutes.length; i++)
	{
		System.out.println(viaRoutes[i]);
	}
	
	System.out.println(System.lineSeparator());
	System.out.println("Stops");
	System.out.println("====================");
	for(int i=0; i<stops.length; i++)
	{
		System.out.println(stops[i]);
	}
	
	
	System.out.println(System.lineSeparator());
	System.out.println("Platform No In Bus Stand");
	System.out.println("====================");
	for(int i=0; i<platformNoInBusStand.length; i++)
	{
		System.out.println(platformNoInBusStand[i]);
	}
	
	
	System.out.println(System.lineSeparator());
	System.out.println("Tiffan In Bus");
	System.out.println("====================");
	for(int i=0; i<tiffanInBus.length; i++)
	{
		System.out.println(tiffanInBus[i]);
	}
	
	
	System.out.println(System.lineSeparator());
	System.out.println("Snacks In Bus");
	System.out.println("====================");
	for(int i=0; i<snacksInBus.length; i++)
	{
		System.out.println(snacksInBus[i]);
	}
	
	
	System.out.println(System.lineSeparator());
	System.out.println("Seat Numbers");
	System.out.println("====================");
	for(int i=0; i<seatNumbers.length; i++)
	{
		System.out.println(seatNumbers[i]);
	}
	
	}

}
