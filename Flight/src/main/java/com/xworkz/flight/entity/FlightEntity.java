package com.xworkz.flight.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "flight")
public class FlightEntity {
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "cname")
	private String cname;
	
	@Column(name = "fname")
	private String fname;
	
	@Column(name = "cost")
	private Double cost;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "country")
	private String country;

}
