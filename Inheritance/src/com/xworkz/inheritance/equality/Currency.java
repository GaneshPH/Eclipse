package com.xworkz.inheritance.equality;

public class Currency {
	private String type1;
	private String type2;
	private String type1Material;
	private String type2Material;
	private String nationality;
	private String bank;
	private String printedYear;
	private String colorof2000Note;
	private String colorof100Note;
	private String colorof500Note;
	
	public Currency() {
		super();
	}

	public Currency(String type1, String type2, String type1Material, String type2Material, String nationality,
			String bank, String printedYear, String colorof2000Note, String colorof100Note, String colorof500Note) {
		super();
		this.type1 = type1;
		this.type2 = type2;
		this.type1Material = type1Material;
		this.type2Material = type2Material;
		this.nationality = nationality;
		this.bank = bank;
		this.printedYear = printedYear;
		this.colorof2000Note = colorof2000Note;
		this.colorof100Note = colorof100Note;
		this.colorof500Note = colorof500Note;
	}

	@Override
	public String toString() {
		return "Currency [type1=" + type1 + ", type2=" + type2 + ", type1Material=" + type1Material + ", type2Material="
				+ type2Material + ", nationality=" + nationality + ", bank=" + bank + ", printedYear=" + printedYear
				+ ", colorof2000Note=" + colorof2000Note + ", colorof100Note=" + colorof100Note + ", colorof500Note="
				+ colorof500Note + "]";
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Currency) {
			Currency cast=(Currency)obj;
			if (this.type1.equals(cast.type1) 
					&& this.type2.equals(cast.type2)
					&& this.type1Material.equals(cast.type1Material)
					&& this.type2Material.equals(cast.type2Material)
					&& this.nationality.equals(cast.nationality)) {
				System.out.println("type1, type2, type1Material, type2Material and nationality is same ");
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
