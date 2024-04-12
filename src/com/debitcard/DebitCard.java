package com.debitcard;

public class DebitCard {
	double current_balance = 10000;

	double withdraw(double a) {
		current_balance = current_balance - a;
		System.out.println("Current balance = " + current_balance);
		return current_balance;

	}

	double credit(double b) {
		current_balance = current_balance + b;
		System.out.println("Current balance = " + current_balance);
		return current_balance;
	}

	double check_balance() {
		System.out.println("your current balance is " + current_balance);
		return current_balance;

	}

}
