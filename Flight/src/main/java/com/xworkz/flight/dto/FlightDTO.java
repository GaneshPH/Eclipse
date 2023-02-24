package com.xworkz.flight.dto;

import lombok.Getter;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class FlightDTO {
	private int id;
	
	@NotNull
	@Size(min = 3,max = 20,message = "comanyName should be greater than 3 less than 20")
	private String cname;
	
	@NotNull
	@Size(min = 3,max = 20,message = "name should be greater than 3 less than 20")
	private String fname;
	
	@NotNull
	private Double cost;
	
	@NotBlank(message = "type should not be blank")
	private String type;
	
	@NotBlank(message = "country should not be blank")
	private String country;

}
