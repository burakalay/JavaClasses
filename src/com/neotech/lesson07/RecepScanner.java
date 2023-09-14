package com.neotech.lesson07;

import java.util.Scanner;

public class RecepScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		double salary;
		boolean isRaining;
		char gender;
		String text1;
		int age;
/*		System.out.println("Enter a sentence: ");
		String text1= scanner.next();
        String text2= scanner.next();       
		System.out.println(text2);
		String text3=scanner.nextLine();
		System.out.println(text3);
*/
		
	/*	System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		System.out.println("Enter the current year: ");
		int year = scanner.nextInt();
		
		System.out.println(age+" "+year);
	*/
		
/*		System.out.println("what is your salary? :");
//		salary = scanner.nextDouble();
//		System.out.println("I is raining today?? :");
//		isRaining = scanner.nextBoolean();
//		System.out.println("Salary is "+salary+" an isRaining is "+isRaining);
*/	
	
//		System.out.println("Enter your gender (M or F)");
	//	gender = scanner.next().charAt(3); //method chaining
		//System.out.println(gender);
		
		//long way
	//	String str = scanner.next();
	  //  gender = str.charAt(0);
		
		System.out.println("Enter your name, age, salary, and gender:");
		text1=scanner.next();
		age = scanner.nextInt();
        salary = scanner.nextDouble();
        gender = scanner.next().charAt(0);
        System.out.println(text1+" "+age+" "+" "+salary+" "+" "+gender);
	
	
	}

}
