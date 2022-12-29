package com.xworks.collection;

public class PlaceDTO {
	private String name;
	private int pinCode;
	private String famousFor;
	
	public PlaceDTO() {
		
	}

	public PlaceDTO(String name, int pinCode, String famousFor) {
		super();
		this.name = name;
		this.pinCode = pinCode;
		this.famousFor = famousFor;
	}
	@Override
	public boolean equals (Object ref) {
		System.out.println("Running");
		if(ref != null) {
			if(ref instanceof PlaceDTO) {
				PlaceDTO dto = (PlaceDTO)ref;
				if(dto.name.equals(this.name)) {
					System.out.println("Name is matched: "+dto.name);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", pinCode=" + pinCode + ", famousFor=" + famousFor + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}
	
	

}
