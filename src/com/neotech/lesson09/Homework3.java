package com.neotech.lesson09;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		
	 Scanner scanner = new Scanner(System.in);
	 
	 int attempts =10;
	 boolean applied = false;
	 
	  for (int i=1; i<=attempts; i++) {
		  
		  System.out.println("Do you wanna apply a credit card? ");
		  String answer=scanner.nextLine();
		   
		if(answer.equalsIgnoreCase("yes")) {
			
			System.out.println("You applied for a new credit card!");
			applied = true;
			break;
			
		}
		
		else {
			
			System.out.println("You didn't applied, please think again...");
			
		}
		
		
	
	
		
	
		  
	  }

	}

}
