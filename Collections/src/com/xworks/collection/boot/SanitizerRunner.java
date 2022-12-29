package com.xworks.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworks.collection.SanitizerDTO;

public class SanitizerRunner {

	public static void main(String[] args) {

		SanitizerDTO dto1 = new SanitizerDTO(123, "Dettol", 237, "White");
		SanitizerDTO dto2 = new SanitizerDTO(234, "BoroPlus", 220, "White");
		SanitizerDTO dto3 = new SanitizerDTO(345, "Savlon", 300, "Blue");
		SanitizerDTO dto4 = new SanitizerDTO(456, "Lifebuoy", 280, "Green");
		SanitizerDTO dto5 = new SanitizerDTO(567, "Appollo", 180, "Blue");
		SanitizerDTO dto6 = new SanitizerDTO(678, "Himalaya", 241, "Yellow");
		SanitizerDTO dto7 = new SanitizerDTO(789, "Dabur", 232, "Transperent");
		SanitizerDTO dto8 = new SanitizerDTO(891, "Sashkat", 250, "Yellow");
		SanitizerDTO dto9 = new SanitizerDTO(910, "Patanjali", 150, "Red");
		SanitizerDTO dto10 = new SanitizerDTO(101,"Purell", 957, "Transperent");
		
		Collection<SanitizerDTO> collections = new ArrayList<SanitizerDTO>();
		
		collections.add(dto1);
		collections.add(dto2);
		collections.add(dto3);
		collections.add(dto4);
		collections.add(dto5);
		collections.add(dto6);
		collections.add(dto7);
		collections.add(dto8);
		collections.add(dto9);
		collections.add(dto10);	
		
		Iterator<SanitizerDTO> itr1 = collections.iterator();
		while(itr1.hasNext()) {
			SanitizerDTO element= itr1.next();
			if(element.getPrice()>5) {
				System.out.println("Sanitizer price above 5;"+ element);
			}
		}
		Iterator<SanitizerDTO> itr2 = collections.iterator();
        while(itr2.hasNext()) {
        	SanitizerDTO element = itr2.next();
        	if(element!=null) {
        		System.out.println("Element is not null:"+ element);
        	}
        }
		Iterator<SanitizerDTO> itr3 = collections.iterator();
        while(itr3.hasNext()) {
        	SanitizerDTO element = itr3.next();
        	if(element.getColor().matches("Red")) {
        		itr3.remove();
        		System.out.println("element is removed:"+ element);
        	}
        }
		Iterator<SanitizerDTO> itr4 = collections.iterator();
		while(itr4.hasNext()) {
			SanitizerDTO element = itr4.next();
			if(element.getPrice()<200) {
				System.out.println("Least price of sanitizer:"+ element);
			}
		}
		Iterator<SanitizerDTO> itr5 = collections.iterator();
		while(itr5.hasNext()) {
			SanitizerDTO element = itr5.next();
			if(element.getPrice()>700) {
				System.out.println("Maximum price os sanitizer:"+element);
			}
		}
		Iterator<SanitizerDTO> itr6 = collections.iterator();
		while(itr6.hasNext()) {
			SanitizerDTO element = itr6.next();
			if(element.getPrice()>999) {
				System.out.println("Second max price of sanitizer:"+ element);
			}
		}

	}

}
