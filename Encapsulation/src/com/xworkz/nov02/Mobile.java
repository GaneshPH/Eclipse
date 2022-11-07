package com.xworkz.nov02;

public class Mobile {
	private String brand;
	private String modelName;
	private double price;
	private String androidVersion;
	private int ram;
	public int rom;
	public boolean memorycardSlot;
	public String availableIn;
	public boolean discount;
	public int gst;
	public String color;
	
	
	public Mobile(int rom, boolean memorycardSlot, String availableIn, boolean discount, int gst, String color) {
		super();
		this.rom = rom;
		this.memorycardSlot = memorycardSlot;
		this.availableIn = availableIn;
		this.discount = discount;
		this.gst = gst;
		this.color = color;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getAndroidVersion() {
		return androidVersion;
	}


	public void setAndroidVersion(String androidVersion) {
		this.androidVersion = androidVersion;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public void showoff() {
		System.out.println("ROM: "+ this.rom);
		System.out.println("memorycardSlot: "+ this.memorycardSlot);
		System.out.println("availableIn: "+ this.availableIn);
		System.out.println("discount: "+ this.discount);
		System.out.println("GST: "+ this.gst);
		System.out.println("color: "+ this.color);
		
	}
	
	
	

}
