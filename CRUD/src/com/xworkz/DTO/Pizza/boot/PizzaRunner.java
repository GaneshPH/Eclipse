package com.xworkz.DTO.Pizza.boot;

import com.xworkz.DTO.Pizza.dto.PizzaDTO;
import com.xworkz.DTO.Pizza.service.PizzaService;
import com.xworkz.DTO.Pizza.service.PizzaServiceImpl;
import com.xworkz.DTO.Pizza.constant.PizzaSize;


public class PizzaRunner {
	public static void main(String[] args) {
		
		PizzaDTO pizzadto = new PizzaDTO("Corn Pizza", "Dominos", PizzaSize.SMALL, true, 99.99, "Corn", "VEG");
		System.out.println(pizzadto);
		
		
	
		PizzaService service = new PizzaServiceImpl();
		service.validateAndSave(pizzadto);
				
	
		
		
		
	}

}
