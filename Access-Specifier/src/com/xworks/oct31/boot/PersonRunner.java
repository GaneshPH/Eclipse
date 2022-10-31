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
	   
	      Email email=new Email(21, 856974, 96325870);
	      
	      Email email1=new Email(22, 856975,96325874);
	      Email email2=new Email(23,856976, 96387410);
	      Email email3=new Email(24,856972, 92587410);
	      Email email4=new Email(25,856974, 96587410);
	     
	    	  Email[] mails= {email,email1,email2,email3,email4};	
	      
	    	   
	    	  Person person=new Person();
	    	      person.setEmail(mails);
	    	      person.display();
		}

}
