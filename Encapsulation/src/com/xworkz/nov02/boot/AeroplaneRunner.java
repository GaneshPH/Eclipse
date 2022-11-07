package com.xworkz.nov02.boot;

import com.xworkz.nov02.Aeroplane;
import com.xworkz.nov02.AeroplaneAccessClass;

public class AeroplaneRunner {
	
	public static void main(String[] args) {
		Aeroplane aeroplane=new Aeroplane(565656, 6, "Bengaluru", "12:30", "Hubballi", "2:30", 400, "Akash", "Bengaluru");
		
		AeroplaneAccessClass aero= new AeroplaneAccessClass() ;
		aero.useAeroplane(aeroplane);
		aeroplane.showoff();
		
	}
	

}
