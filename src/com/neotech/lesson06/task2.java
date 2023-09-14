package com.neotech.lesson06;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		
		Scanner average = new Scanner(System.in);
		
		System.out.println("Please enter the first number: ");
		
		int num1= average.nextInt();
		
		System.out.println("Please enter the second number: ");
		
		int num2=average.nextInt();
		
		System.out.println("The average is :"+(num1+num2)/2);

	}

}
