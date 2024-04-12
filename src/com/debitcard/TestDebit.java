package com.debitcard;

import java.util.Scanner;

public class TestDebit {
	public  void operatingAtm( ) throws WrongPinException {
		DebitCard D = new DebitCard();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for EXIT");
			System.out.print("Choose the operation you want to perform: ");

			int choice = sc.nextInt();
			System.out.println("enter the pin");
			int pin = sc.nextInt();
			if (pin == 1234) {
				switch (choice) {

				case 1:
					System.out.print("Enter money to be withdrawn: ");
					double a = sc.nextInt();
					D.withdraw(a);
					break;

				case 2:
					System.out.println("Enter money to be deposited:");
					double b = sc.nextInt();
					D.withdraw(b);
					break;

				case 3:
					D.check_balance();
					break;

				case 4:
					System.out.println("you have been logged out.");
					System.exit(0);

				}
			} else {
				//System.out.println("You have entered wrong pin");
				throw new WrongPinException("You have entered wrong pin");
			}
		}

	}public static void main(String[] args) {
		TestDebit td = new TestDebit();
		try {
			td.operatingAtm();
		} catch (WrongPinException e) {
			e.printStackTrace();
			System.out.println("You have been logged out");
		}
		
	}
}
