package com.grocery;

public class Grocery {

	double Add(int n1, int n2, int n3) {

		double sum = n1 + n2 + n3;
		// System.out.println("addition = " + n3);
		return sum;
	}

	double GST(int n1, int n2, int n3) {

		double GSTbill = this.Add(n1, n2, n3) + (this.Add(n1, n2, n3) * 8) / 100;
		return GSTbill;
	}

	double discountedBill(int n1, int n2, int n3) {

		double discountedprice = this.GST(n1, n2, n3) - (this.GST(n1, n2, n3) * 20) / 100;

		System.out.println("Total BILL = " + this.Add(n1, n2, n3));
		System.out.println("TOTAL BILL WITH GST =" + this.GST(n1, n2, n3));
		System.out.println("TOTAL BILL AFTER DISCOUNT OF 20% = " + discountedprice);
		return discountedprice;

	}
}
