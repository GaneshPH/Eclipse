package com.xworkz.aeroplane.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.aeroplane.dto.AeroplaneDto;
import com.xworkz.aeroplane.service.AerplaneService;

@Controller
@RequestMapping("/")
public class AeroplaneController {

	@Autowired
	private AerplaneService aeroplaneService;

	public AeroplaneController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	private List<String> type = Stream.of("Domestic", "International", "Army", "Commercial", "Cargo", "Business")
			.collect(Collectors.toList());
	private List<String> country = Stream.of("India", "Japan", "Dubai", "Usa", "China", "Australia", "Russia")
			.collect(Collectors.toList());

	@GetMapping("/reg")
	public String getRegister(Model model) {
		System.out.println("running in getMapping ");
		model.addAttribute("type", type);
		model.addAttribute("country", country);
		return "Register";
	}

	@PostMapping("/flight")
	public String postRegister(Model model, AeroplaneDto dto) {
		model.addAttribute("type", type);
		model.addAttribute("country", country);
		Set<ConstraintViolation<AeroplaneDto>> violation = this.aeroplaneService.validateAndSave(dto);
		if (violation.isEmpty()) {
			System.out.println("No Violation");
			model.addAttribute("reply", "Data Saved Sucessfully");

			return "Register";

		}

		model.addAttribute("errors", violation);
		model.addAttribute("message", "Data is not Saved");
		return "Register";

	}

	@GetMapping("/search")
	public String getSearch(Model model, @RequestParam int id) {
		System.out.println("Running Search");
		AeroplaneDto dto = this.aeroplaneService.findBy(id);
		if (dto != null) {
			model.addAttribute("DTO", dto);
		} else {
			model.addAttribute("message", "Do not found ");
		}
		return "Search";
	}

}
