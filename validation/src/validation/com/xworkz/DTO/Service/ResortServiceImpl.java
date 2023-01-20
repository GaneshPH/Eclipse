package validation.com.xworkz.DTO.Service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import validation.com.xworkz.DTO.Repository.ResortRepo;
import validation.com.xworkz.DTO.dto.ResortDTO;

@Component
public class ResortServiceImpl {
	@Autowired
	private Validator validator;
	@Autowired
	private ResortRepo resortRepo;

	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("Started validateAndSave");
		System.out.println("DTO passed " + dto);

		Set<ConstraintViolation<ResortDTO>> violation = this.validator.validate(dto);
		if (!violation.isEmpty()) {
			System.out.println("Error...");
			violation.forEach(ele -> System.out.println(ele.getMessage()));
			return false;
		} else {
			System.out.println("DTO valid");
			boolean saved = resortRepo.save(dto);
			System.out.println("Saved :" + dto);
			return saved;
		}

	}

}
