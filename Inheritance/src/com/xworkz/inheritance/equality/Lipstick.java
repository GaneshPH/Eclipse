package com.xworkz.inheritance.equality;

public class Lipstick {

	private String brandName;
	private int price;
	private String form;
	private String finish;
	private int weightInGram;
	private String color;
	private String quantity;
	private String sellername;
	private String onlineRating;
	private String mfgDate;
	
	public Lipstick() {
		super();
	}
	
	public Lipstick(String brandName, int price, String form, String finish, int weightInGram, String color,
			String quantity, String sellername, String onlineRating, String mfgDate) {
		super();
		this.brandName = brandName;
		this.price = price;
		this.form = form;
		this.finish = finish;
		this.weightInGram = weightInGram;
		this.color = color;
		this.quantity = quantity;
		this.sellername = sellername;
		this.onlineRating = onlineRating;
		this.mfgDate = mfgDate;
	}

	@Override
	public String toString() {
		return "Lipstick [brandName=" + brandName + ", price=" + price + ", form=" + form + ", finish=" + finish
				+ ", weightInGram=" + weightInGram + ", color=" + color + ", quantity=" + quantity + ", sellername="
				+ sellername + ", onlineRating=" + onlineRating + ", mfgDate=" + mfgDate + "]";
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Lipstick) {
			Lipstick cast=(Lipstick)obj;
			if (this.brandName.equals(cast.brandName) 
					&& this.price==(cast.price)
					&&this.form==(cast.form)
					&&this.finish==(cast.finish)
					&&this.weightInGram==(cast.weightInGram)
					&&this.color.equals(cast.color)
					&&this.sellername.equals(cast.sellername)
					&&this.mfgDate.equals(cast.mfgDate)) {
				System.out.println("brandName, price,  form, finish, weightInGram,  mfgDate and color is same ");
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
