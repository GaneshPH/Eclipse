package com.xworkz.copy.boot;

import com.xworkz.copy.*;

public class TeaRunner {

	public static void main(String[] args) {

		System.out.println("Chaa");
		Tea chaapudi=new Tea();
		
		System.out.println("name :" +chaapudi.name);
		System.out.println("brand :" +chaapudi.brand);
		System.out.println("colour :" +chaapudi.colour);
		System.out.println("withSugar :" +chaapudi.withSugar);
		System.out.println("mfgPlace :" +chaapudi.mfgPlace);
		System.out.println("mfgdate :" +chaapudi.mfgdate);
		System.out.println("expDate :" +chaapudi.expDate);
		System.out.println("availability :" +chaapudi.availability);
		System.out.println("dealername :" +chaapudi.dealername);
		
		chaapudi.dealerRating=3;
		chaapudi.modeOfTransport="tataAce";
		chaapudi.onTime=true;
		chaapudi.teaFlavour="yalakki";
		chaapudi.discount=true;
		chaapudi.discountPercentage=22;
		chaapudi.onlineDelivery=true;
		chaapudi.onlineDeliveryName="Amazon";
		chaapudi.tax=18.8;
		
		System.out.println("dealerRating :" +chaapudi.dealerRating);
		System.out.println("modeOfTransport :" +chaapudi.modeOfTransport);
		System.out.println("onTime :" +chaapudi.onTime);
		System.out.println("teaFlavour :" +chaapudi.teaFlavour);
		System.out.println("discountPercentage :" +chaapudi.discountPercentage );
		System.out.println("discount :" +chaapudi.discount);
		System.out.println("onlineDelivery :" +chaapudi.onlineDelivery);
		System.out.println("onlineDeliveryName :" +chaapudi.onlineDeliveryName);
		System.out.println("tax :" +chaapudi.tax);
		
	}

}
