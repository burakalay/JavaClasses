package com.neotech.lesson06;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {

		/*Write a program that will ask for the day (a number from 1-7). Print whether it is a weekend or weekday.
	If any day from 1-5 → output "It is a weekday"
	Any day from 6-7 → output "It is a weekend",
	Any other day → output "Invalid day" */
		
		
		Scanner days = new Scanner (System.in);
		
		System.out.println("Enter a weekday from 1 to 7: ");
		
		int numdays = days.nextInt();
		
		if (numdays>=1 && numdays<=5) {
			
			System.out.println("It's a weekday, get back to work!");
		}
		
		else if(numdays==6 || numdays==7) {
			
			System.out.println("It's a weekend, you can enjoy the party!");
		}
		
		else {
			
			System.out.println("This is an invalid day, you dumb.");
		}
		
	}

}
