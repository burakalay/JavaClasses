package com.neotech.lesson07;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		Scanner grade = new Scanner(System.in);
		String input;
		System.out.println("Please enter a grade: ");
		String explanation;
		input=grade.next();
		
		switch(input) {
		
		case "A":
		case "a":
		  explanation = "Excellent";
		  break;
		case "B":
		case "b":
		  explanation = "Good";
		  break;
		case "C":
		case "c":
		  explanation ="Average";
		  break;
		case "D":
		case "d":
		  explanation = "Bad";
		  break;
		  
		default:
		 explanation ="Not Acceptable";
		 break;
		
		}
		
		System.out.println("Your grade is: "+explanation);
		
		
		
	}

}
