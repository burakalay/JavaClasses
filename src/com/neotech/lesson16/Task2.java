package com.neotech.lesson16;

public class Task2 {

	/*
	 * Create a String and if the String is not empty perform the following: - if
	 * the String has an odd number of characters and has 3 or more characters,
	 * print the character in the middle of the String.
	 */

	public static void main(String[] args) {

	
	String str = "BurakAlay";
	
	//iEmpty
	
	if(!str.isEmpty()) {
		
		int length = str.length();
		
		if(length%2==1 && length >=3) {
			
			//if the string has an odd number of characters
			//if the string has 3 or more characters
								//str.charAt(2);
			System.out.println(str.charAt(length/2));
			
			
		}
			
			else {
				System.out.println("Either the length is even or less than 3");
				 }
		
		              }
	
	else {
		System.out.println("The string is empty");
	}
	
	}

}
