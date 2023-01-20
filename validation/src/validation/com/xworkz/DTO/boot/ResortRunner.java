package validation.com.xworkz.DTO.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import validation.com.xworkz.DTO.Config.configure;
import validation.com.xworkz.DTO.Service.ResortService;
import validation.com.xworkz.DTO.dto.ResortDTO;

public class ResortRunner {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(configure.class);
		ResortService service = container.getBean(ResortService.class);
		boolean ref=service.validateAndSave(new ResortDTO());
		System.out.println(ref);
	}


}
