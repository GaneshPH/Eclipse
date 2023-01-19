package validation.com.xworkz.Soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import validation.com.xworkz.Soldier.dto.SoldierDTO;
import validation.com.xworkz.Soldier.repository.SoldierRepo;

public class SoldierServiceImpl implements SoldierService {
	private SoldierRepo SoldierRepo;

	public SoldierServiceImpl(validation.com.xworkz.Soldier.repository.SoldierRepo soldierRepo) {
		super();
		SoldierRepo = soldierRepo;
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("Running Validate And Save Method");
		System.out.println("DTO passed " + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violation = validator.validate(dto);
		if (!violation.isEmpty()) {
			System.out.println("Error");
			violation.forEach(ele -> System.out.println(ele.getMessage()));
			return false;
		} else {
			System.out.println("DTO is valid");
			boolean Saved = SoldierRepo.save(dto);
			System.out.println("Saved " + dto);
			return Saved;

		}
	}

}