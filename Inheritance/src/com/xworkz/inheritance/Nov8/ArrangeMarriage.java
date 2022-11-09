package com.xworkz.inheritance.Nov8;

	
	public class ArrangeMarriage extends Marriage {
		
		public String brideName;
		public String groomName;
		
		
		public ArrangeMarriage(String marriageLocation, long attendedPeoples, String date, String brideName,
				String groomName) {
			super(marriageLocation, attendedPeoples, date);
			this.brideName = brideName;
			this.groomName = groomName;
		}


		}


