package com.xworkz.aeroplane.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class AeroplaneDto {
	
	private int id;
	@NotNull
	@Size(min = 4, max = 20, message = "comanyName should be greater than 3 less than 20")
	private String company;
	@NotNull
	@Size(min = 4, max = 20, message = "name should be greater than 3 less than 20")
	private String name;
	@NotNull
	private Double cost;
	@NotBlank(message = "Type Should not be blank")
	private String type;
	@NotBlank(message = "country should not be blank")
	private String country;


}
