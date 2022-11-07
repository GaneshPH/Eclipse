package com.xworkz.nov02.boot;

import com.xworkz.nov02.Hostel;
import com.xworkz.nov02.HostelAccessClass;

public class HostelRunner {

	
	public static void main(String[] args) {
		Hostel hostel= new Hostel("Karnatak", "Tiptur", "wifi, Hotwater", 120, 3, "tiptur", true, "Dileep", true);
		HostelAccessClass home= new HostelAccessClass();
		home.useHostel(hostel);
		hostel.showoff();
	}
}
