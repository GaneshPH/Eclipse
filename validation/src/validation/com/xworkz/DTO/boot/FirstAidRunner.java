package validation.com.xworkz.DTO.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import validation.com.xworkz.DTO.Config.configure;
import validation.com.xworkz.DTO.Service.FirstAidServiceImpl;
import validation.com.xworkz.DTO.dto.FirstAidDTO;

public class FirstAidRunner {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(configure.class);
		FirstAidServiceImpl service = applicationContext.getBean(FirstAidServiceImpl.class);
		boolean ref = service.validateAndSave(new FirstAidDTO());
		System.out.println(ref);
	}

}
