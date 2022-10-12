package com.xworkz.copy.boot;

import com.xworkz.copy.*;

public class CigaratteRunner {

	public static void main(String[] args) {
		System.out.println("Hoge");
		Cigaratte Batti = new Cigaratte();
		
		System.out.println("name : " +Batti.name);
		System.out.println("brand : " +Batti.brand);
		System.out.println("price : " +Batti.price);
		System.out.println("priceForPack :" +Batti.priceForPack);
		System.out.println("mintBlast :" +Batti.mintBlast);
		System.out.println("colour :" +Batti.colour);
		System.out.println("puffColour : " +Batti.puffColour);
		System.out.println("availability : " +Batti.availability);
		System.out.println("contains : " +Batti.contains);
		
		Batti.WrappingMaterial="paper";
		Batti.dealerName="cigaratteSeena";
		Batti.discount=2;
		Batti.tax=28;
		Batti.mfgDate="12/10/2022";
		Batti.injurios=true;
		Batti.batchNumber=25;
		Batti.whereToPutAsh="AshTray";
		Batti.typeOfPollution="AirPollution";
		
		System.out.println("WrappingMaterial : " +Batti.WrappingMaterial);
		System.out.println("dealerName : " +Batti.dealerName);
		System.out.println("discount : " +Batti.discount);
		System.out.println("tax : " +Batti.tax);
		System.out.println("mfgDate : " +Batti.mfgDate);
		System.out.println("injurios : " +Batti.injurios);
		System.out.println("batchNumber : " +Batti.batchNumber);
		System.out.println("whereToPutAsh : " +Batti.whereToPutAsh);
		System.out.println("typeOfPollution : " +Batti.typeOfPollution);
		

	}

}
