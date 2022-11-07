package com.xworkz.nov02.boot;

import com.xworkz.nov02.Bus;
import com.xworkz.nov02.BusAccessClass;

public class BusRunner {
	
	public static void main(String[] args) {
		Bus bus = new Bus(true, "Chennai", "10:30PM", "Byadgi", "8:30AM", 52, "BSVI", "Byadgi");
		
		BusAccessClass Ksrtc = new BusAccessClass();
		Ksrtc.useBus(bus);
		bus.showoff();
	}

}
