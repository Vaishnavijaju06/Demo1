package com.Switch.calculator;

public class Calculator {

//1
	int Addtwo(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("addition = " + sum);
		return sum;
		
	}

//2
	int Subtwo(int n1, int n2) {
		int sub = n1 - n2;
		// System.out.println(sum);
		System.out.println("Subtraction = " + sub);
		return sub;
	}

//3
	int multitwo(int n1, int n2) {
		int multiplication = n1 * n2;
		System.out.println("Multiplication = " + multiplication);
		return multiplication;
	}

// 4
	double divtwo(int n1, int n2) {
		double div = (n1 / n2);
		System.out.println("Division = " + div);
		return div;
	}

	// 5
	int avgtwo(int n1, int n2) {
		int sum = this.Addtwo(n1, n2);
		int avg = sum / 2;
//	    System.out.println(sum);
//		System.out.println(sub);
//		System.out.println(multiplication);
//		System.out.println(division);
		System.out.println("Average =" + avg);
		return avg;
	}

	int modtwo(int n1, int n2) {
		int mod = n1 % n2;
		System.out.println("Remainder = " + mod);
		return mod;
	}
}
