package validation.com.xworkz.DTO.Repository;

import org.springframework.stereotype.Component;
import validation.com.xworkz.DTO.dto.FirstAidDTO;

@Component
public class FirstAidImpl implements FirstAidRepo {
	@Override
	public boolean save(FirstAidDTO dto) {

		System.out.println("running save method ");
		return true;
	}

}
