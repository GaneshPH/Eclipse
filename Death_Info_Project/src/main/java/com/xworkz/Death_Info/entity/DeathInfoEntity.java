package com.xworkz.Death_Info.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.Boolean;


@Entity
@Table(name = "deathinfo")
@Data
@NoArgsConstructor
@NamedQuery(name = "findByName",query = "select entity from DeathInfoEntity entity where entity.name=:set")
public class DeathInfoEntity {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	
	@Column(name = "age")
	private int age;
	
	
	@Column(name = "reasonOfDeath")
	private String reasonOfDeath;
	
	
	@Column(name = "location")
	private String location;
	
	
	@Column(name = "married")
	private Boolean married;

}
