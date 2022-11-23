package com.xworkz.inheritance.equality;

public class HospitalRunner {
	public static void main(String[] args) {
		Hospital hospital = new Hospital("KC General", "Malleshwaram", 560021, 24, 98776655, "Government", false, true, true,"Dr. Omkar");
		System.out.println(hospital);
		
		Hospital hospital2 = new Hospital("Appolo", "Rajajinagar", 560021, 24, 74102580, "Private", false, false, false, "Dr. Omkar");
		System.out.println(hospital2);
		
		boolean Aspatre = hospital.equals(hospital2);
		System.out.println(Aspatre);
	}

}
