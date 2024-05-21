package JavaProject;

import java.util.Scanner;

public class ATMManagementSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To World Bank !!!");
		System.out.println("please Enter Your Name ,User Id, & Password ");

		System.out.println("Name:");
		String name = sc.nextLine();
		System.out.print("User Id:");
		String uid = sc.next();
		System.out.println("Password:");
		String pass = sc.next();
		if (uid.equalsIgnoreCase("Nkyadav650") && pass.equals("Rawan@123")) {
			System.out.println("Welcome Mr." + name);
			double amount = 0;
			char chh = 'y';
			while (chh == 'y') {
				System.out.println("To Deposite type 'D' or To Withdrow type 'W' or Check Balance type 'B' : ");
				char ch = sc.next().charAt(0);
				int pin;

				switch (ch) {
				// for Deposite
				case 'D': {
					System.out.println("Enter the amount: ");
					double deposite = sc.nextDouble();

					System.out.print("Enter the pin: ");
					pin = sc.nextInt();
					if (pin == 1234) {
						amount += deposite;
						System.out.println("Deposite Successfully.");
					} else {
						System.out.println("invalid pin try Again");
						continue;
					}
					break;
				}
				// for withdrowal
				case 'W': {
					System.out.println("Enter the amount: ");
					double withdrow = sc.nextDouble();
					System.out.print("Enter the pin: ");
					pin = sc.nextInt();
					if (pin == 1234) {
						if (amount < withdrow) {
							System.out.println("insufficient balance..");
							continue;
						}
						amount -= withdrow;
						System.out.println("Withdrowal Successfully.");
					} else {
						System.out.println("invalid try Again");
						continue;
					}
					break;
				}
				// For Balance Check
				case 'B': {
					System.out.print("Enter the pin: ");

					pin = sc.nextInt();
					if (pin == 1234) {
						System.out.println("Your Balance" + amount);
					} else {
						System.out.println("invalid pin try Again");
						continue;
					}
					break;
				}
				}
				System.out.println("Do you want to continue(y/n): ");
				ch = sc.next().charAt(0);
				if (ch == 'y') {
					continue;
				} else {
					break;
				}
			}
			System.out.println("Thank You for visiting World Bank...");

		} else {
			System.out.println("invalid Id or Password..");

		}
	sc.close();
	}

}
