package com.neotech.lesson07;

public class IntroToSwitch {

	public static void main(String[] args) {

    // given a number 1-7
		int day=1;
		String nameDay;
		switch (day) {
		case 1:
			nameDay="Monday";
		break;
		case 2:
			nameDay="Tuesday";
		break;
		case 3:
			nameDay="Wednesday";
		break;
		case 4:
			nameDay="Thursday";
		break;
		case 5:
			nameDay="Friday";
		break;
		case 6:
			nameDay="Saturday";
		break;
		case 7:
			nameDay="Sunday";
		break;
		
		default:
			nameDay="Invalid input";
		break;
		}
		System.out.println(nameDay);
		
		
	}

}
