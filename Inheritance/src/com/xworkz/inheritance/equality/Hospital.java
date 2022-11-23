package com.xworkz.inheritance.equality;

public class Hospital {
	private String hospital;
	private String location;
	private int areaPincode;
	private int openHours;
	private long phoneNumber;
	private String ownership;
	private boolean onlineAppointment;
	private boolean freeFood;
	private boolean medicalShopInsideHospital;
	private String mainDoctorName;
	
	public Hospital() {
		super();
	}

	public Hospital(String hospital, String location, int areaPincode, int openHours, long phoneNumber,
			String ownership, boolean onlineAppointment, boolean freeFood, boolean medicalShopInsideHospital,
			String mainDoctorName) {
		super();
		this.hospital = hospital;
		this.location = location;
		this.areaPincode = areaPincode;
		this.openHours = openHours;
		this.phoneNumber = phoneNumber;
		this.ownership = ownership;
		this.onlineAppointment = onlineAppointment;
		this.freeFood = freeFood;
		this.medicalShopInsideHospital = medicalShopInsideHospital;
		this.mainDoctorName = mainDoctorName;
	}

	@Override
	public String toString() {
		return "Hospital [hospital=" + hospital + ", location=" + location + ", areaPincode=" + areaPincode
				+ ", openHours=" + openHours + ", phoneNumber=" + phoneNumber + ", ownership=" + ownership
				+ ", onlineAppointment=" + onlineAppointment + ", freeFood=" + freeFood + ", medicalShopInsideHospital="
				+ medicalShopInsideHospital + ", mainDoctorName=" + mainDoctorName + "]";
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Hospital) {
			Hospital cast=(Hospital)obj;
			if (this.hospital.equals(cast.hospital) 
					&& this.location.equals(cast.location)
					&&this.areaPincode==(cast.areaPincode)
					&&this.openHours==(cast.openHours)
					&&this.phoneNumber==(cast.phoneNumber)
					&&this.ownership.equals(cast.ownership)) {
				System.out.println("hospital, location,  areaPincode, openHours, phoneNumber and ownership is same ");
				return true;
			}
			else {
				System.out.println("Bere Bere");
	
				return false;
			
		}
	
		}
		return false;
	}
	

}
