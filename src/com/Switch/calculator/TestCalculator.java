package com.Switch.calculator;

import java.util.Scanner;

public class TestCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Choice = ");
		String choice = sc.next();
		Calculator c = new Calculator();
		System.out.print("n1 =  ");
		int n1 = sc.nextInt();
		System.out.print("n2 =  ");
		int n2 = sc.nextInt();
		
		switch (choice) {
		
		case "Addition":
			c.Addtwo(n1, n2);
			break;
		case "Subtraction":
			c.Subtwo(n1, n2);
			break;
		case "Multiplication":
			c.multitwo(n1, n2);
			break;
		case "Dividion":
			c.divtwo(n1, n2);
			break;
		case "Average":
			c.avgtwo(n1, n2);
			break;
		case "modulus":
			c.modtwo(n1, n2);
		}
	}
}
