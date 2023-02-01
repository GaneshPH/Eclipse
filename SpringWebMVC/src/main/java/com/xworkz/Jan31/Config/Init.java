package com.xworkz.Jan31.Config;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Init extends AbstractAnnotationConfigDispatcherServletInitializer
implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running the getRootConfigClasses");
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses");
		Class[] ref= {Config.class};
		System.out.println("getServletConfigClasses"+ Arrays.toString(ref));
		System.out.println();
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings");
		String[] str= {"/"};
		System.out.println(" getServletMappings"+Arrays.toString(str));
		return str;
		
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("running configureDefaultServletHandling");
		configurer.enable();
	}

}
