package com.Xworkz.Spring.Autowired.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CameraMan {
	@Autowired
	private Camera camera;

	public CameraMan() {
		System.out.println("Created CameraMan");
	}

}
