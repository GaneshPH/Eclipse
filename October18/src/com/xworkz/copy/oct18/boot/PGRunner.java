package com.xworkz.copy.oct18.boot;

import com.xworkz.copy.oct18.*;

public class PGRunner {

	public static void main(String[] args) {
		String[] breakfastInPg= {"idli", "dosa", "palav", "paddu"};
		String[] lunchInPg= {"anna", "sambar", "rasam", "pallya"};
		String[] dinnerInPg= {"chapathi", "pallya", "anna", "sambar"};
		String[] roomatesName= {"bala", "swamy", "manju", "bassya"};
		String[] roomNoIn1Floor= {"101", "102", "103", "104", "105"};
		String[] facilities= {"wifi", "hotWater", "dailyCleaning"};
		
		PG pg=new PG ("VR PG", "Gayatri Nagar", 6, true, breakfastInPg, lunchInPg, dinnerInPg, roomatesName, roomNoIn1Floor, facilities);
		pg.display();
	}

}
