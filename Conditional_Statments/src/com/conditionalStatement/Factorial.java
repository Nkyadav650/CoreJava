package com.conditionalStatement;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int n, i = 1, x = 1;
		String s;
		Scanner sc = new Scanner(System.in);
//factorial of given no
		System.out.println("Enter F/f if you factorial: ");
		char op = sc.next().charAt(0);
		do {
			x = 1;
			i = 1;
			System.out.print("Enter your number which you want factorial: ");
			n = sc.nextInt();
			do {
				x = x * i;
				i++;
				continue;

			} while (i <= n);
			switch (op) {
			case 'f':
				System.out.println(x);
				break;
			case 'F':
				System.out.println(x);
				break;
			default:
				System.out.println("Invalid Key");
			}

			System.out.println("Press 'yes' if you want continue or press any key to exit");
			s = sc.next();
		} while (s.equals("Yes") || s.equals("YES") || s.equals("yes"));
		System.out.println("Thankyou for using");

		sc.close();
	}

}
