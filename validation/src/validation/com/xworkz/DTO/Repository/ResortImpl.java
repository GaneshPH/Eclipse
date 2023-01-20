package validation.com.xworkz.DTO.Repository;

import org.springframework.stereotype.Component;

import validation.com.xworkz.DTO.dto.ResortDTO;

@Component
public class ResortImpl implements ResortRepo {
	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("running save method");
		return true;
	}

}
