package com.xworkz.DTO.Pizza.service;

import com.xworkz.DTO.Pizza.constant.PizzaSize;
import com.xworkz.DTO.Pizza.dto.PizzaDTO;


public class PizzaServiceImpl implements PizzaService{


	@Override
	public boolean validateAndSave(PizzaDTO pizza) {
		System.out.println("Running");
		String name = pizza.getName();
		String company = pizza.getCompany();
		PizzaSize size = pizza.getSize();
		boolean cheese = pizza.isCheese();
		double price = pizza.getPrice();
		String flavour = pizza.getFlavour();
		String type = pizza.getType();


		if(name!=null && name.length() >= 4 && name.length()<20) {
			System.out.println("System is Valid: "+name);
		}
		else {
			System.err.println("System is InValid");
		}
		if(company != null && company.length() >= 4 && company.length() <= 20) {
			System.out.println("System is valid: "+company);
		}
		else {
			System.err.println("System is InValid");
		}
		if(size != null) {
			System.out.println("System is valid: "+size);
		}
		else {
			System.err.println("System is InValid");
		}
		if(price>50 && price<2000) {
			System.out.println("System is valid: "+price);
		}
		else {
			System.err.println("System is InValid");
		}
		if(flavour != null && flavour.length() >= 3 && flavour.length() <= 20) {
			System.out.println("System is valid: "+flavour);
		}
		else {
			System.err.println("System is InValid");
		}
		if(type != null && type == "VEG" || type == "NON VEG") {
			System.out.println("System is valid: "+type);
		}
		else {
			System.err.println("System is in valid");
		}

		return false;
	}

}



