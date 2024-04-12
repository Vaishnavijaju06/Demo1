package com.armstrong;

public class Armstrong {
	public static void main(String[] args) {
		int num = 153;
		int temp, sum = 0;
		int ori = num;

		while (num != 0) {
			temp = num % 10;
			sum = sum + (temp * temp * temp);
			num = num / 10;

			
		}
		if (sum == ori) {
			System.out.println("is armstrong");
		} else {
			System.out.println("not a armstrong");
		}

	}

}
