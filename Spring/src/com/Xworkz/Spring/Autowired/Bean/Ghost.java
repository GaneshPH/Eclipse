package com.Xworkz.Spring.Autowired.Bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	@Autowired
	private String name;
	@Autowired
	private String area;
	@Autowired
	private String location;
	@Autowired
	private String nativeLocation;
	@Autowired
	@Qualifier("pin")
	private int areaPincode;
	private String gender;
	private LocalDate birthdate;
	private LocalDate deathdate;
	private String reasonOfDeath;
	private boolean realGhost;

	public Ghost(@Qualifier("gen") String gender, @Qualifier("birthDate") LocalDate birthdate,
			@Qualifier("deathDate") LocalDate deathdate, @Qualifier("deathReason") String reasonOfDeath,
			@Qualifier("realOrFake") boolean realGhost) {
		super();
		this.gender = gender;
		this.birthdate = birthdate;
		this.deathdate = deathdate;
		this.reasonOfDeath = reasonOfDeath;
		this.realGhost = realGhost;
	}

	@Override
	public String toString() {
		return "Ghost [name=" + name + ", area=" + area + ", location=" + location + ", nativeLocation="
				+ nativeLocation + ", areaPincode=" + areaPincode + ", gender=" + gender + ", birthdate=" + birthdate
				+ ", deathdate=" + deathdate + ", reasonOfDeath=" + reasonOfDeath + ", realGhost=" + realGhost + "]";
	}

}
