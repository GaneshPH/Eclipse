package com.xworkz.nov02.boot;

import com.xworkz.nov02.College;
import com.xworkz.nov02.CollegeAccessClass;

public class CollegeRunner {
	
	public static void main(String[] args) {
		
		College college = new College(false, 6, 6, true);
		CollegeAccessClass kollege=new CollegeAccessClass();
		kollege.useCollege(college);
		college.showoff();
				
	}

}
