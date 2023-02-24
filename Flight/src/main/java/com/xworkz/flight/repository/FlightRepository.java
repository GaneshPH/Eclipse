package com.xworkz.flight.repository;

import com.xworkz.flight.entity.FlightEntity;

public interface FlightRepository {
	boolean save(FlightEntity entity);
	
	default FlightEntity findBy(int id) {
		return null;
	}


}
