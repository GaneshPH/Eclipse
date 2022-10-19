package com.xworkz.copy.oct18.boot;

import com.xworkz.copy.oct18.*;

public class BusStandRunner {
	
	public static void main (String[] rgs) {
		
		String[] busDailyatPF= {"PF1-55", "PF2-60", "PF3-105", "PF4-88"};
		String[] busnumber= {"KA01F5132", "KA68F6565", "KA25F4541", "MH14F8965"};
		String[] busDepot= {"bengaluru", "Byadgi", "hubballi", "pune"};
		String[] capacity= {"66", "55", "55", "55"};
		String[] busTimings= {"12:30", "20:00", "19:00", "01:30"};
		String[] busTypes= {"Karnataka Sarige", "Rajahamsa", "Corona", "MSRTC"};
		
		BusStand busstand = new BusStand("kempegowda BS", 11, true, true, busDailyatPF, busnumber, busDepot, capacity, busTimings, busTypes);
				busstand.display();
		
		
	}
	
	

}
