package com.xworkz.Exception.repository;

public interface EmailReepository {
	boolean create(String email);
	
	default int total() {
	return 0;
	}
}
