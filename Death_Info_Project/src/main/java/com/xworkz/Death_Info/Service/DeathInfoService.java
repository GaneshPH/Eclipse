package com.xworkz.Death_Info.Service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.Death_Info.dto.DeathInfoDTO;

public interface DeathInfoService {


	Set<ConstraintViolation<DeathInfoDTO>> validateAndSave(DeathInfoDTO deathInfoDTO);

	default DeathInfoDTO findByID(int id) {
		return null;
	}

	default List<DeathInfoDTO> findByName(String name) {
		return null;
	}
	
	Set<ConstraintViolation<DeathInfoDTO>> validateAndUpdate(DeathInfoDTO deathInfoDTO);

	default boolean validateAnddelete(int id) {
		return false;
	}
}
