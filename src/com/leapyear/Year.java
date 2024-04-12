package com.leapyear;

import java.util.Scanner;

public class Year {
	public static void main(String[] args) {

//		 Scanner sc = new Scanner(System.in);
//		 int year = sc.nextInt();

		for (int year = 400; year <= 2200; year++) { // if wanna use for loop

			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
					} else {
						// System.out.println("This is not a LEAP year " + year);
					}

				} else {
					System.out.println("This is a LEAP year " + year);
				}
			} else {
				// System.out.println("This is not a LEAP year " + year);

			}

		}
	}
}