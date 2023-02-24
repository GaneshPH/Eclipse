package com.xworkz.aeroplane.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.aeroplane.dto.AeroplaneDto;

public interface AerplaneService {
	Set<ConstraintViolation<AeroplaneDto>> validateAndSave(AeroplaneDto dto);

	default AeroplaneDto findBy(int id) {
		return null;

	}

}
