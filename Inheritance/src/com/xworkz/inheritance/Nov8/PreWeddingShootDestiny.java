package com.xworkz.inheritance.Nov8;

public class PreWeddingShootDestiny extends PreWeddingShoot{
	public String destiny1;
	public String destiny2;
	
	
	public PreWeddingShootDestiny(String location, String photographerName, long contactNumber, String destiny1,
			String destiny2) {
		super(location, photographerName, contactNumber);
		this.destiny1 = destiny1;
		this.destiny2 = destiny2;
	}
	

}
