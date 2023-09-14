package com.neotech.lesson06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {

		/*Ask the user to enter the height in inches. Person should be classified as one of the following:
	• short (under 60 inch)
	• medium (between 60 -72 inch)
	• tall (over 72 inch) */
		
		Scanner height = new Scanner (System.in);
		
		System.out.println("Please enter your height in inches: ");
		
		int inch = height.nextInt();
		
		if(inch>0 && inch<60) {
			
			System.out.println("You are \"short\"! ");
			
		}
		else if(inch>=60 && inch<=72) {
			
			
			System.out.println("You are \"medium! ");
		}
		
		else if(inch>72){
			
			System.out.println("You are \"tall. You should be basketball player ^^");
		}
		
		else {
			
			System.out.println("Invalid input");
		}
		
		
	}

}
