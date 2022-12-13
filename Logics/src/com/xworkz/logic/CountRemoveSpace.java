package com.xworkz.logic;

public class CountRemoveSpace {
	public static void main(String[] args) {
		
		 String str="Hands on learning happens here Xworkz";
		 String s="";
		 int count=0;
		 for(char ch:str.toCharArray()) {
			 if(ch==' ') {
				 count++; // or count=count+1
			 }else {
				 s=s+ch;
			 }
			
		 }
		 System.out.println("white spaces:"+count);
		 System.out.println("String without white spaces:"+s);
		 
	}

}
