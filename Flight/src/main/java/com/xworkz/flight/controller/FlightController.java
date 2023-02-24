package com.xworkz.flight.controller;

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

import com.xworkz.flight.dto.FlightDTO;
import com.xworkz.flight.entity.FlightEntity;
import com.xworkz.flight.repository.FlightRepository;
import com.xworkz.flight.service.FlightSeervice;

@Controller
@RequestMapping("/")
public class FlightController {

	@Autowired
	private FlightRepository flightRepository;

	@Autowired
	private FlightSeervice flightSeervice;
	private List<String> type = Stream.of("Domestic", "International", "Army", "Commercial", "Cargo", "Business")
			.collect(Collectors.toList());
	private List<String> country = Stream.of("India", "Japan", "Dubai", "Usa", "China", "Australia", "Russia")
			.collect(Collectors.toList());

	public FlightController() {
		System.out.println("Running FlightController");
	}

	@GetMapping("/flight")
	public String onFlight(Model model) {
		System.out.println("Running onFlight");
		model.addAttribute("type", type);
		model.addAttribute("country", country);

		return "Register";
	}

	@PostMapping("/flight")
	public String onFlight(Model model, FlightDTO dto) {
		System.out.println("Running Flight post method");

		model.addAttribute("type", type);
		model.addAttribute("country", country);
		Set<ConstraintViolation<FlightDTO>> violations = flightSeervice.Validateandsave(dto);
		if (violations.isEmpty()) {
			System.out.println("Saving data ");

			FlightEntity entity = new FlightEntity();

			entity.setCname(dto.getCname());
			entity.setCost(dto.getCost());
			entity.setCountry(dto.getCountry());
			entity.setType(dto.getType());
			entity.setFname(dto.getFname());
			boolean save = flightRepository.save(entity);
			System.out.println(save);

		} else {
			System.out.println("Viloation is there please cheak data");
		}
		return "Flight";
	}
	
//	@GetMapping("/search")
//	public String getSearch(Model model, @RequestParam int id) {
//
//		FlightDTO dto = this.flightSeervice.findBy(id);
//		if (dto != null) {
//			model.addAttribute("dto", dto);
//		} else {
//			model.addAttribute("message", "Do not found ");
//		}
//		return "search";
//	}

}
