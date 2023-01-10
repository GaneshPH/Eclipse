package com.xworkz.logic;

import java.util.Scanner;

public class MarksValidation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks obtained");
		
		int marks = sc.nextInt();
		
		if (marks >= 81 && marks <= 100) {
			System.out.println("Distinction");
		}
		else if (marks <= 80 && marks >= 60) {
			System.out.println("First class");
		}
		else if (marks <= 60 && marks >= 35) {
			System.out.println("Pass");
		}
		else {
			System.err.println("fail");
		}
	}

}
