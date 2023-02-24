package com.xworkz.flight.service;

import java.util.Set;


import javax.validation.ConstraintViolation;


import com.xworkz.flight.dto.FlightDTO;

public interface FlightSeervice {

	Set<ConstraintViolation<FlightDTO>> Validateandsave(FlightDTO dto);

	FlightDTO onfind(int id);

}
