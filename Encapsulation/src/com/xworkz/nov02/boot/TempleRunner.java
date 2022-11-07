package com.xworkz.nov02.boot;

import com.xworkz.nov02.Temple;
import com.xworkz.nov02.TempleAccessClass;

public class TempleRunner {
	
	public static void main(String[] args) {
		
		Temple temple = new Temple("Subramanya Road", "Dharmastala", true);
		TempleAccessClass Manjunatha=new TempleAccessClass();
		Manjunatha.useTemple(temple);
		temple.showoff();
}

}
