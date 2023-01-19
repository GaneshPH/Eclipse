package validation.com.xworkz.Soldier.dto;

import lombok.Setter;
import lombok.Getter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SoldierDTO extends AbstractAuditDTO {

	@NotNull
	@NotBlank
	@Size(min = 5,max = 12, message = "Name size is not range of 5 to 12")
	private String name;
	

	@Min(value = 3,message = "Id must range minimum 3")
	private int id;
	
	@NotNull
	@NotBlank
	@Size(min = 3,max = 10 ,message = "Country size is not range of 3 to 10")
	private String rank;
	
	@NotNull
	@NotBlank
	@Size(min = 4,max = 15 ,message = "Country size is not range of 4 to 15")
	private String country;
	
	@NotNull
	@NotBlank
	@Size(min = 4,max = 15 ,message = "Country size is not range of 4 to 15")
	private String nativePlace;
}
