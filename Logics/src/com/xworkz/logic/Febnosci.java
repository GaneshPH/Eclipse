package com.xworkz.logic;

public class Febnosci {
	public static void main(String[] args) {
		
		// 1 1 2 3 5 8
		 //f+s=t
		// 1+1=2
		int f=1;
		int s=1;
		int t;
		
		System.out.println(f);
		System.out.println(s);
		for(int i=0;i<10;i++)
		{
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
		}
	}

}
