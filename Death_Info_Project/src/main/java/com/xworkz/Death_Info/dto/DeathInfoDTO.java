package com.xworkz.Death_Info.dto;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.lang.Boolean;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class DeathInfoDTO {

	@NotBlank(message = "Name cannot be Blank")
	@Size(min = 3, max = 20, message = "name should be greater than 3 and lesser than 20")
	private String name;
	
	
	@NotNull	
	private int age;

	@NotBlank(message = "reasonOfDeath cannot be Blank")
	@Size(min = 3, max = 20, message = "address should be greater than 3 and lesser than 20")
	private String reasonOfDeath;

	@NotBlank(message = "location cannot be Blank")
	@Size(min = 3, max = 20, message = "address should be greater than 3 and lesser than 20")
	private String location;

	private Boolean married;

	private int id;

}
