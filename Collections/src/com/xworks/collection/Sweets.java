package com.xworks.collection;

import java.util.TreeSet;

public class Sweets {
	 
	public static void main(String args[]){  
	//Creating and adding elements  
	
	
	String Sweet1 =("HoneyCake");
	String Sweet2 =("Jamoon");
	String Sweet3 =("cake");
	String Sweet4 =("ChocoLava");
	String Sweet5 =("pastry");
	String Sweet6 =("biscuit");
	String Sweet7 =("barfi");
	String Sweet8 =("Rasagulla");
	String Sweet9 =("Jilebi");
	String Sweet10 =("DryJamoon");
	String Sweet11 =("Holige");
	String Sweet12 =("Dharwad Peda");
	String Sweet13 =("kunda");

	
	TreeSet<String> set=new TreeSet();
	
	set.add(Sweet1);  
	set.add(Sweet2);  
	set.add(Sweet3);  
	set.add(Sweet4);
	set.add(Sweet5); 
	set.add(Sweet6);  
	set.add(Sweet7);  
	set.add(Sweet8);
	set.add(Sweet9); 
	set.add(Sweet10);  
	set.add(Sweet11);  
	set.add(Sweet12);
	set.add(Sweet13); 
	System.out.println(set.size());
	
	set.clear();
	
	System.out.println("After clearing");
	
	System.out.println(set.size());  
	} 

}
