package com.xworkz.inheritance.equality;

public class Paint {
	private String brand;
	private int price;
	private int quantity;
	private String type;
	private String colorMostSold;
	private boolean onlineDelivery;
	private String onlineWebsite;
	private boolean homedelivery;
	private String mfgdate;
	private String packingType;
	
	
	public Paint() {
		super();
	}


	public Paint(String brand, int price, int quantity, String type, String colorMostSold, boolean onlineDelivery,
			String onlineWebsite, boolean homedelivery, String mfgdate, String packingType) {
		super();
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		this.type = type;
		this.colorMostSold = colorMostSold;
		this.onlineDelivery = onlineDelivery;
		this.onlineWebsite = onlineWebsite;
		this.homedelivery = homedelivery;
		this.mfgdate = mfgdate;
		this.packingType = packingType;
	}


	@Override
	public String toString() {
		return "Paint [brand=" + brand + ", price=" + price + ", quantity=" + quantity + ", type=" + type
				+ ", colorMostSold=" + colorMostSold + ", onlineDelivery=" + onlineDelivery + ", onlineWebsite="
				+ onlineWebsite + ", homedelivery=" + homedelivery + ", mfgdate=" + mfgdate + ", packingType="
				+ packingType + "]";
	}

	
	public boolean equals(Object obj) {
		if(obj instanceof Paint) {
			Paint cast=(Paint)obj;
			if (this.brand.equals(cast.brand) && this.colorMostSold.equals(cast.colorMostSold)) {
				System.out.println("Brand and colorMostSold is same ");
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
	
