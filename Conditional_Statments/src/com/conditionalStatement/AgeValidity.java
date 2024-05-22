package com.conditionalStatement;

import java.util.Scanner;

class AgeValidity {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your age");
		int age = s.nextInt();
		if (age < 18) {
			System.out.println("Your age is too younger");
		} else {
			System.out.println("Program run successfully");
		}
		s.close();
	}	
}
