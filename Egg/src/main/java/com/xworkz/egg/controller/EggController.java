package com.xworkz.egg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.egg.DTO.EggDTO;
import com.xworkz.egg.service.EggService;


@Controller
@RequestMapping("/egg")
public class EggController {
	
	@Autowired
	private EggService service;
	
	public EggController() {
		System.out.println("Created: "+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onOrder(Model model, EggDTO dto) {
		System.out.println("Runnnig");
		boolean saved=this.service.validateAndSave(dto);
		System.out.println("Saved: "+saved);
		
		return "index";
	}

}
