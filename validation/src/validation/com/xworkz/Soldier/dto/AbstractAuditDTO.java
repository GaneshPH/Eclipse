package validation.com.xworkz.Soldier.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class AbstractAuditDTO implements Serializable {
	private String createdBy;
	private LocalDateTime createdOn;
	private String updatedBy;
	private LocalDateTime updatedOn;
}