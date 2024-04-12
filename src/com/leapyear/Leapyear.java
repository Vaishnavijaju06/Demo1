package com.leapyear;

public class Leapyear {

	public static void main(String[] args) {
		int year = 444;
		boolean leapyear = true;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leapyear = true;
				} else {
					leapyear = false;	}
			} else {
				leapyear = true;}
		} else {
			leapyear = false;}
		if (leapyear) {
			System.out.println(" year is leap year");
		} else {
			System.out.println("year is not leap year");}
	}

}
