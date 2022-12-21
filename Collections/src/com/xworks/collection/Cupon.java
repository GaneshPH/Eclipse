package com.xworks.collection;

import java.util.LinkedList;

public class Cupon {
public static void main(String[] args) {
		
		String coupon1 =("DOMNEW30");
		String coupon2 =("XMAS300");
		String coupon3 =("XMAS500");
		String coupon4 =("DOMNEW300");
		String coupon5 =("CASHBACK70");
		String coupon6 =("TUESDAYDAMAKA");
		String coupon7 =("XMASOFFER500");
		String coupon8 =("TRENDS1000");
		String coupon9 =("XWORKS500");
		String coupon10 =("ORIONMALL");
		
		
		
		LinkedList<String> coupon = new LinkedList();
		
		coupon.add(coupon1);
		coupon.add(coupon2);
		coupon.add(coupon3);
		coupon.add(coupon4);
		coupon.add(coupon5);
		coupon.add(coupon6);
		coupon.add(coupon7);
		coupon.add(coupon8);
		coupon.add(coupon9);
		coupon.add(coupon10);
		
		
        System.out.println(coupon.size());
		
        coupon.clear();
        
		System.out.println("After clearing..");
		
		System.out.println(coupon.size());	
	}

}
