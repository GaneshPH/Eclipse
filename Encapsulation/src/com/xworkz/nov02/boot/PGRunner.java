package com.xworkz.nov02.boot;

import com.xworkz.nov02.PG;
import com.xworkz.nov02.PGAccessClass;

public class PGRunner {
	public static void main(String[] args) {
		
		PG pg = new PG("Sudha MRP", "Malleshwaram", false, 4);
		PGAccessClass peegee = new PGAccessClass();
		peegee.usePG(pg);
		pg.showoff();
		
		
	}

}
