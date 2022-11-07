package com.xworkz.nov02.boot;

import com.xworkz.nov02.Mobile;
import com.xworkz.nov02.MobileAccessClass;

public class MobileRunner {

	public static void main(String[] args) {
		Mobile mobile = new Mobile(128, false, "Amazon, Flipkart", false, 18, "Black");
		MobileAccessClass phone= new MobileAccessClass();
		phone.useMobile(mobile);
		mobile.showoff();
	}
	
}
