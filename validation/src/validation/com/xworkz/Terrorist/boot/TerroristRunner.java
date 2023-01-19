package validation.com.xworkz.Terrorist.boot;

import validation.com.xworkz.Terrorist.dto.TerroristDTO;
import validation.com.xworkz.Terrorist.service.TerroristImpl;

public class TerroristRunner {
	public static void main(String[] args) {
		TerroristDTO dto = new TerroristDTO("Kasab", 40, "Male", false, false, "Shooting", "Talibhan");

		TerroristImpl impl = new TerroristImpl();
		impl.validateAndSave(dto);
		System.out.println(dto.getName());
	}

}
