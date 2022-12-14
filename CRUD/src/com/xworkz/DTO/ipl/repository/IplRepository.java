package com.xworkz.DTO.ipl.repository;

import com.xworkz.DTO.ipl.dto.IplDTO;


public interface IplRepository {
	
	boolean create (IplDTO dto);
	
	default int total() {
		return 0;
	}

}
