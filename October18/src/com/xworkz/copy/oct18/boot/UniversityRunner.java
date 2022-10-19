package com.xworkz.copy.oct18.boot;

import com.xworkz.copy.oct18.*;

public class UniversityRunner {

	public static void main(String[] args) {
		String[] colleges= {"BMS", "KIT", "CIT", "SIT", "GMIT"};
		String[] collegesLocation= {"bengaluru", "Tiptur", "gubbi", "Tumkur", "Dvg"};
		String[] branchesInCollege={"Mech", "CS", "Civil", "IS", "EC"};
		int[] noOfStudentsInCollege= {1500, 500, 500, 800, 1000}; 
		String[] placementCompanies= {"ABC", "DEF", "GHI", "JKL"};
		String[] placedStudents= {"1400", "400", "400", "700", "900"};
		
		University university = new University("VTU", "Belagavi", 350000, "Karisiddappa", colleges, collegesLocation, branchesInCollege, noOfStudentsInCollege, placementCompanies, placedStudents);
		university.display();
	}

}
