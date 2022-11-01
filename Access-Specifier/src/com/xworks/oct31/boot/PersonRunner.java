package com.xworks.oct31.boot;

import com.xworks.oct31.Address;
import com.xworks.oct31.Location;
import com.xworks.oct31.Company;
import com.xworks.oct31.Country;
import com.xworks.oct31.Job;
import com.xworks.oct31.Email;
import com.xworks.oct31.Person;

public class PersonRunner {
	public static void main(String[] args) {
		
		Location location=new Location();
		
		//
	    Address address=new Address();
	    address.display();
	     //
	    Company company=new Company();
	    company.display();
	     //
	    Job job=new Job();
	    job.display();
	     //
	   
	      Email email=new Email("xworkz@gmail.com", 856974, 96325870);
	      
	      Email email1=new Email("xworkz1@gmail.com", 856975,96325874);
	      Email email2=new Email("xworkz2@gmail.com",856976, 96387410);
	      Email email3=new Email("xworkz3@gmail.com",856972, 92587410);
	      Email email4=new Email("xworkz4@gmail.com",856974, 96587410);
	     
	    	  Email[] mails= {email,email1,email2,email3,email4};	
	      
	    	   
	    	  Person person=new Person();
	    	      person.setEmail(mails);
	    	      person.display();
		}

}
