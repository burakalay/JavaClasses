package com.neotech.lesson05;

public class Homework2 {

	public static void main(String[] args) {
		
		
		/*
		 * Write a program to implement following logic using
if-else if-else statement:
    if hour is less than 12 noon, greet with Good Morning
    if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
    if hour is greater than or equal to 3 pm, greet with Good Evening
		 *  
		 *  */
		
		int hour = 1;
		
		if(hour<12 && hour>0) {
			
			System.out.println("Good morning sunshine!");
		}
		
		else if (hour>=12 && hour<15) {
			
			System.out.println("Good afternoon!");
		}
		else if (hour>=15 && hour<=24) {
			
			System.out.println("Good evening");
		}
		
		else {
			
			System.out.println("invalid day time");
		}
	

	}

}
