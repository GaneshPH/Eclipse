package validation.com.xworkz.DTO.Repository;

import org.springframework.stereotype.Component;

import validation.com.xworkz.DTO.dto.MissileDTO;

@Component
public class MissileImpl implements MissileRepo{

	@Override
	public boolean save(MissileDTO dto) {
		System.out.println("running save method");
		return true;
	}

}
