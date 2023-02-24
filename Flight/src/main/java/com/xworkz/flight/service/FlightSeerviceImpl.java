package com.xworkz.flight.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.xworkz.flight.dto.FlightDTO;
import com.xworkz.flight.entity.FlightEntity;

@Service
public class FlightSeerviceImpl implements FlightSeervice {

	private Object repositery;

	public FlightSeerviceImpl() {
		System.out.println("Running FlightSeerviceImpl");
	}

	@Override
	public FlightDTO onfind(int id) {
		return null;
	}

	@Override
	public Set<ConstraintViolation<FlightDTO>> Validateandsave(FlightDTO dto) {
		System.out.println("Running Validateandsave");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Set<ConstraintViolation<FlightDTO>> violations = factory.getValidator().validate(dto);

		if (!violations.isEmpty()) {
			System.out.println("Vilotion is there please cheak data");
			return violations;
		} else {
			System.out.println("Validatio sucess proceed to save ");
			return Collections.emptySet();
		}

	}
	
	public FlightDTO findBy(int id) {
		if (id > 0) {
			FlightEntity entity = this.repositery.onFind(id);
			if (entity != null) {
				AeroplaneDto dto = new AeroplaneDto();
				dto.setCompany(entity.getCompany());
				dto.setCost(entity.getCost());
				dto.setCountry(entity.getCountry());
				dto.setName(entity.getName());
				dto.setType(entity.getType());
				dto.setId(entity.getId());
				return dto;
			}
		}
		return AeroplaneService.super.findBy(id);

	}

}
