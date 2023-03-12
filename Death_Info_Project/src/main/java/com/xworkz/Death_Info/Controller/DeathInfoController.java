package com.xworkz.Death_Info.Controller;

import java.util.Arrays; 

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.Death_Info.Service.DeathInfoService;
import com.xworkz.Death_Info.dto.DeathInfoDTO;



@Controller
@RequestMapping("/")
public class DeathInfoController {
	
	@Autowired
	private DeathInfoService deathInfoService;
	
	private List<String> type = Arrays.asList("Hospital", "Home", "Accident");

	public DeathInfoController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@GetMapping("/death")
	public String onDeath(Model model, DeathInfoDTO deathInfoDTO) {
		System.out.println("Running get method onDeath");
		model.addAttribute("type", type);
		return "DeathInfo";
	}
	
	
	@PostMapping("/death")
	public String onDeathInfo(Model model, DeathInfoDTO deathInfoDTO) {
		System.out.println("Running onDeathInfo post method"+deathInfoDTO);
		Set<ConstraintViolation<DeathInfoDTO>> violation = this.deathInfoService
				.validateAndSave(deathInfoDTO);
		if (!violation.isEmpty()) {
			violation.forEach((cv) -> System.out.println(cv.getMessage()));
			return "DeathInfo";
		}
		System.out.println("No violations");
		return "Success";

	}
	
	@PostMapping("/search")
	public String onSearch(Model model, @RequestParam int id) {
		System.out.println("Running onSearch"+id);
		DeathInfoDTO dto= this.deathInfoService.findByID(id);
		if(dto!=null) {
		model.addAttribute("deathInfoDTO",dto);
		}else {
			model.addAttribute("msg","ID not found");
		}
		return "Search";
	}
	
	@GetMapping("/findByName")
	public String onFindByName(Model model,@RequestParam String name) {
		System.out.println("Running onFindByName");
		
		List<DeathInfoDTO> list= this.deathInfoService.findByName(name);
		if(list!=null && !list.isEmpty()) {
			model.addAttribute("list",list);
		}else {
			model.addAttribute("msg","Data not found");
		}
		return "SearchByName";
	}
	
	@GetMapping("/update")
	public String onUpdate(@RequestParam int id,Model model) {
		System.out.println("Running onUpdate");
		DeathInfoDTO dto= this.deathInfoService.findByID(id);
		model.addAttribute("dto",dto);
		model.addAttribute("type",type);
		
		return "Update";
	}
	
	
	@PostMapping("/update")
	public String onUpdate(Model model,DeathInfoDTO deathInfoDTO) {
		System.out.println("Running onUpdate post");
		Set<ConstraintViolation<DeathInfoDTO>> violtion= this.deathInfoService.validateAndUpdate(deathInfoDTO);
		if(!violtion.isEmpty()) {
			model.addAttribute("err",violtion);
			return "Update";
		}else {
			model.addAttribute("msg", "Updated Successfully");
		return "Update";
		}
	}
	
	@GetMapping("/delete")
	public String onDelete(@RequestParam int id,Model model) {
		System.out.println("Running onDelete");
		boolean delete=this.deathInfoService.validateAnddelete(id);
		if(delete=true) {
			System.out.println("deleted data of :"+id);
			model.addAttribute("delete", "Deleted successfully : ID : ");
			model.addAttribute("id",id);
		}else {
			model.addAttribute("notDeleted","Id not found");
		}
		return "SearchByName";
	}
}
