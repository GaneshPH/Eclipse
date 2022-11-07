package com.xworkz.nov02.boot;

import com.xworkz.nov02.Hotel;
import com.xworkz.nov02.HotelAccessClass;

public class HotelRunner {
	
	public static void main(String[] args) {
		Hotel hotel=new Hotel("Karnataka", "Bengaluru", 3, false, 0, 0, "bengaluru", "bengaluru", false);
		HotelAccessClass angadi = new HotelAccessClass();
		angadi.useHotel(hotel);
		hotel.showoff();
	}

}
