package com.xworkz.inheritance.equality;

public class WaterBottle {
	private String brandName;
	private int capacityInL;
	private String bodyColor;
	private String capColor;
	private int price;
	private boolean availableInOnline;
	private String webSiteName;
	private String material;
	private String dealerName;
	
	public WaterBottle() {
		super();
	}

	public WaterBottle(String brandName, int capacityInL, String bodyColor, String capColor, int price,
			boolean availableInOnline, String webSiteName, String material, String dealerName) {
		super();
		this.brandName = brandName;
		this.capacityInL = capacityInL;
		this.bodyColor = bodyColor;
		this.capColor = capColor;
		this.price = price;
		this.availableInOnline = availableInOnline;
		this.webSiteName = webSiteName;
		this.material = material;
		this.dealerName = dealerName;
	}

	@Override
	public String toString() {
		return "WaterBottle [brandName=" + brandName + ", capacityInL=" + capacityInL + ", bodyColor=" + bodyColor
				+ ", capColor=" + capColor + ", price=" + price + ", availableInOnline=" + availableInOnline
				+ ", webSiteName=" + webSiteName + ", material=" + material + ", dealerName=" + dealerName + "]";
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof WaterBottle) {
			WaterBottle cast=(WaterBottle)obj;
			if (this.brandName.equals(cast.brandName) 
					&& this.bodyColor.equals(cast.bodyColor)
							&& this.capacityInL==(cast.capacityInL) ){
				System.out.println("brand is same");
				return true;
			}
			else {
				System.out.println("brand is diff");
				return false;
			}
		}
		return false;
	}
	

}
