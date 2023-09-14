package com.neotech.lesson06;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		
		/*
		 
		  *Create a java program that will ask user to input
		  *city and temperature.
		  *Your program should convert Fahrenheit into celcius and
		  *print "The temperature in the city __ is __"
		  */
		Scanner scan = new Scanner (System.in);
		String city;
		double f,c;
		
		System.out.println("Please enter the city and the temperature");
		city = scan.nextLine();
		f = scan.nextDouble();
		 
		c = (f-32)*5/9;
		
		System.out.println("The temperature in "+city+" is "+c+" degree celcius");

	}

}
