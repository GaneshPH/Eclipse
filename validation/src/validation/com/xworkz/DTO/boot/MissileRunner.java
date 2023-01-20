package validation.com.xworkz.DTO.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import validation.com.xworkz.DTO.Config.configure;
import validation.com.xworkz.DTO.Service.MissileServiceImpl;
import validation.com.xworkz.DTO.dto.MissileDTO;

public class MissileRunner {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(configure.class);
		MissileServiceImpl service = container.getBean(MissileServiceImpl.class);
		service.validateAndSave(new MissileDTO());
	}
}
