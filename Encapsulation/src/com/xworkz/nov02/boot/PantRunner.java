package com.xworkz.nov02.boot;

import com.xworkz.nov02.PanntAccessClass;
import com.xworkz.nov02.Pant;

public class PantRunner {

	public static void main(String[] args) {
		Pant pant=new Pant("Blue", 38, true, true, false, "Amazon", 999.99, "cotton", "full Length", "Ankel Fit", "Modern");
		
		PanntAccessClass p=new PanntAccessClass();
		p.usePant(pant);
		pant.showoff();
		
	}

}
