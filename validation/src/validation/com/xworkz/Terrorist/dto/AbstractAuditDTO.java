package validation.com.xworkz.Terrorist.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public abstract class AbstractAuditDTO implements Serializable {
	private String createdBy;
	private LocalDate createdAt;
	private String updatedBy;
	private LocalDate updatedAt;

}