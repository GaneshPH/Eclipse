package com.xworkz.egg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.egg.DTO.EggDTO;
import com.xworkz.egg.repo.EggRepo;

@Service
public class EggServiceImpl implements EggService{
	
	@Autowired
	private EggRepo repo;
	
	public EggServiceImpl() {
		System.out.println("Created: "+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean validateAndSave(EggDTO dto) {
		System.out.println("Running validate and save");
		boolean saved=repo.save(dto);
		System.out.println("Saved: "+saved);
		
		return false;
	}

}
