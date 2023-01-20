package validation.com.xworkz.DTO.Service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import validation.com.xworkz.DTO.Repository.MissileRepo;
import validation.com.xworkz.DTO.dto.MissileDTO;

@Component
public class MissileServiceImpl {
	@Autowired
	private Validator validator;
	@Autowired
	private MissileRepo missileRepo;

	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("Started");
		System.out.println("Misile DTO passed " + dto);

		Set<ConstraintViolation<MissileDTO>> violation = this.validator.validate(dto);
		if (!violation.isEmpty()) {
			System.out.println("Error...");
			violation.forEach(ele -> System.out.println(ele.getMessage()));
			return false;
		} else {
			System.out.println("DTO valid");
			boolean saved = missileRepo.save(dto);
			System.out.println("Saved :" + dto);
			return saved;
		}

	}

}
