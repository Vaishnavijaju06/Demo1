package com.grocery;
import java.util.Scanner;
public class TestGrocery {
	public static void main(String[] args) {
	Grocery G = new Grocery();
	
Scanner sc = new Scanner (System.in);
System.out.println("n1 = ");
int n1 =sc.nextInt();
System.out.println("n2 = ");
int n2 =sc.nextInt();
System.out.println("n3 = ");
int n3 =sc.nextInt();
G.discountedBill(n1,n2,n3);

	}

}