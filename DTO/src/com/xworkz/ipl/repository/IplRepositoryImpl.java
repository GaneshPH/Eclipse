package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.IplDTO;

public class IplRepositoryImpl implements IplRepository {
	
	private IplDTO[] iplDto = new IplDTO[10];
	private int currentIndex = 0;
	
	@Override
	public boolean create (IplDTO dto) {
		System.out.println("Running" + dto);
		if(this.currentIndex >= this.iplDto.length) {
			System.err.println("Size Exceded cannot add");
			return false;
		}
		
		this.iplDto[this.currentIndex]=dto;
		System.out.println("saved " + dto + "In Index" + this.currentIndex);
		this.currentIndex++;
		return true;
		
	}
	

}
