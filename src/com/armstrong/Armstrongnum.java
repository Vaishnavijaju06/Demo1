package com.armstrong;

import java.util.Scanner;

public class Armstrongnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("check number ");
		int num = sc.nextInt();
		int temp, sum = 0;
		int ori;
		int count = 0;
		ori = num;
		while (ori != 0) {

			ori /= 10;
			count++;
		}
		System.out.println(count);
		ori = num;

		while (ori != 0) {
			temp = ori % 10;
			sum = (int) (sum + Math.pow(temp, count));
			ori /= 10;
		}
		if (sum == num) {
			System.out.println(num + " is an armstrong number");
		} else {
			System.out.println(num+ " is not an armstrong number");
		}
	}
}
