package com.xworkz.inheritance.Nov9.boot;

import com.xworkz.inheritance.Nov9.SatelliteMoon;

public class SatelliteRunner {
	public static void main(String[] args) {
		SatelliteMoon moon = new SatelliteMoon(384400, "1737 Km", "Round");
		moon.display();
	}

}
