package com.xworkz.nov02;

public class MobileAccessClass {
	
	public Mobile mobile;
	public void useMobile(Mobile mobile) {
		
		mobile.setBrand("Xiaomi");
		System.out.println("Brand :" +mobile.getBrand());
		
		mobile.setModelName("Redmi 12S");
		System.out.println("Model Name: " + mobile.getModelName());
		
		mobile.setAndroidVersion("Android 9.1");
		System.out.println("Android Version: " + mobile.getAndroidVersion());
		
		mobile.setPrice(58000);
		System.out.println("Price: "+ mobile.getPrice());
		
		mobile.setRam(8);
		System.out.println("RAM: " +mobile.getRam());
		
	}

}
