package com.xworkz.inheritance.equality;

public class CurrencyRunner {
	public static void main(String[] args) {
		Currency currency = new Currency("Note", "Coin", "Paper", "Silver", "India", "Reserve Bank Of India", "2019", "Pink", "Blue", "Green");
		System.out.println(currency);
		
		Currency currency2= new Currency("Note", "Coin", "Paper", "Silver", "India", "Reserve Bank Of India", "2019", "Pink", "Blue", "Green");
		System.out.println(currency2);
		
		boolean Duddu= currency.equals(currency2);
		System.out.println(Duddu);
	}
	

}
