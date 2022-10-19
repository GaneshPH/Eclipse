package com.xworkz.copy.boot;

import com.xworkz.copy.*;

public class CigaratteRunner {

	public static void main(String[] args) {
		System.out.println("Hoge");
		Cigaratte cigaratte = new Cigaratte();
		
		System.out.println("name : " +cigaratte.name);
		System.out.println("brand : " +cigaratte.brand);
		System.out.println("price : " +cigaratte.price);
		System.out.println("priceForPack :" +cigaratte.priceForPack);
		System.out.println("mintBlast :" +cigaratte.mintBlast);
		System.out.println("colour :" +cigaratte.colour);
		System.out.println("puffColour : " +cigaratte.puffColour);
		System.out.println("availability : " +cigaratte.availability);
		System.out.println("contains : " +cigaratte.contains);
		
		cigaratte.WrappingMaterial="paper";
		cigaratte.dealerName="cigaratteSeena";
		cigaratte.discount=2;
		cigaratte.tax=28;
		cigaratte.mfgDate="12/10/2022";
		cigaratte.injurios=true;
		cigaratte.batchNumber=25;
		cigaratte.whereToPutAsh="AshTray";
		cigaratte.typeOfPollution="AirPollution";
		
		System.out.println("WrappingMaterial : " +cigaratte.WrappingMaterial);
		System.out.println("dealerName : " +cigaratte.dealerName);
		System.out.println("discount : " +cigaratte.discount);
		System.out.println("tax : " +cigaratte.tax);
		System.out.println("mfgDate : " +cigaratte.mfgDate);
		System.out.println("injurios : " +cigaratte.injurios);
		System.out.println("batchNumber : " +cigaratte.batchNumber);
		System.out.println("whereToPutAsh : " +cigaratte.whereToPutAsh);
		System.out.println("typeOfPollution : " +cigaratte.typeOfPollution);
		

	}

}
