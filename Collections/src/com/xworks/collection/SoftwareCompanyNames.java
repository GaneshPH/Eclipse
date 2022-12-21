package com.xworks.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompanyNames {
	public static void main(String[] args) {
		String company1 = "Google";
		String company2 = "Microsoft";
		String company3 = "Oracle";
		String company4 = "Wipro";
		String company5 = "TCS";
		String company6 = "Infosys";
		String company7 = "Cisco";
		String company8 = "Accenture";
		String company9 = "Adobe";
		String company10 = "IBM";
		String company11 = "Capgemeni";
		String company12 = "Cognizant";
		String company13 = "Hexaware";
		String company14 = "Sasken";
		String company15 = "Deloitte";
		String company16 = "HCL";
		String company17 = "Mphasis";
		String company18 = "Amazon";
		String company19 = "Bosch";
		String company20 = "Intel";

		Collection<String> softwareCompany = new ArrayList<String>();

		softwareCompany.add(company20);
		softwareCompany.add(company19);
		softwareCompany.add(company18);
		softwareCompany.add(company17);
		softwareCompany.add(company15);
		softwareCompany.add(company14);
		softwareCompany.add(company13);
		softwareCompany.add(company12);
		softwareCompany.add(company11);
		softwareCompany.add(company10);
		softwareCompany.add(company9);
		softwareCompany.add(company8);
		softwareCompany.add(company7);
		softwareCompany.add(company6);
		softwareCompany.add(company5);
		softwareCompany.add(company4);
		softwareCompany.add(company3);
		softwareCompany.add(company2);
		softwareCompany.add("Name: "+company1);
		
		System.out.println(softwareCompany.size());
		System.out.println(softwareCompany);

		for (String element : softwareCompany) {
			System.out.println(element);
		}

		System.out.println("-------Iterator-------");
		Iterator<String> ref = softwareCompany.iterator();
		while (ref.hasNext()) {
			String element = ref.next();
			System.out.println(element);
		}
	}

}
