package com.Xworkz.Spring.Autowired.Bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	@Value("horror")
	private String name;
	@Value("movie")
	private String area;
	@Value("allFilmIndustry")
	private String location;
	@Value("filmIndustry")
	private String nativeLocation;
	@Value("123456")
	private int areaPincode;
	private String gender;
	private LocalDate birthdate;
	private LocalDate deathdate;
	private String reasonOfDeath;
	private boolean realGhost;
	
	
	public Ghost(@Qualifier("genderOfGhodt") String gender,
			@Qualifier("birthDate")LocalDate birthdate,
			@Qualifier("deathDate") LocalDate deathdate, 
			@Qualifier("deathReason")String reasonOfDeath,
			@Qualifier("realOrFake")boolean realGhost) {
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
