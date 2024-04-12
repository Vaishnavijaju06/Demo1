package com.hotel;

import java.util.Scanner;

public class HotelBill {
	static String a ;
	int n1;
	int n2;
	int n3;
	double A = totalbill(n1, n2, n3);

	static double totalbill(double x, double y, double z) {
		System.out.println(a= "Hotel Keys");
		Scanner sc = new Scanner(System.in);
		System.out.print("rate of dish one in Rs.= ");
		x = sc.nextDouble();
		System.out.print("rate of dish two in Rs.= ");
		y = sc.nextDouble();
		System.out.print("rate of dish three in Rs.= ");
		z = sc.nextDouble();
		double bill = x + y + z;
		double gstbill = bill + bill * 0.08;
		double discountedbill = gstbill - gstbill * 0.05;

		System.out.println("Bill =" + bill);
		System.out.println("Bill with GST =" + gstbill);
		System.out.println("Total bill = " + discountedbill);
		return discountedbill;

	}

}
