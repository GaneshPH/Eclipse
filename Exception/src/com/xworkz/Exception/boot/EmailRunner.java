package com.xworkz.Exception.boot;

import com.xworkz.Exception.repository.EmailReepository;
import com.xworkz.Exception.repository.EmailRepositoryImple;

public class EmailRunner {
	public static void main(String[] args) {

		EmailReepository emailRepo = new EmailRepositoryImple();
		emailRepo.create("ganeshph.xworkz@gamil.com");
		emailRepo.create("shashankkb.xworkz@gamil.com");
		emailRepo.create("sanjay.xworkz@gamil.com");
		emailRepo.create("rajajinagar.xworkz@gamil.com");
		emailRepo.create("manu.xworkz@gamil.com");
		emailRepo.create("royalChallengers.xworkz@gamil.com");
		emailRepo.create("virat.xworkz@gamil.com");
		emailRepo.create("dhoni.xworkz@gamil.com");
		emailRepo.create("nataraj.xworkz@gamil.com");
		emailRepo.create("sumosis.xworkz@gamil.com");
		System.out.println(emailRepo.total());

	}

}
