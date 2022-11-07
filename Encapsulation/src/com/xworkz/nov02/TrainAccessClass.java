package com.xworkz.nov02;

public class TrainAccessClass {
	
	public Train train;
	public void useTrain(Train train) {
		train.setName("Jan SHatabdi Express");
		System.out.println("Name: "+train.getName());
		
		train.setNumber(121747);
		System.out.println("Number: "+train.getNumber());
		
		train.setColor("Blue, White");
		System.out.println("Color: "+train.getColor());
		
		train.setAC(true);
		System.out.println("AC: "+train.isAC());
		
		train.setDepLocation("Bengaluru");
		System.out.println("Dep Location: "+train.getDepLocation());
		
		train.setDepTime("6:30AM");
		System.out.println("Dep Time: "+train.getDepTime());
	}
	
	

}
