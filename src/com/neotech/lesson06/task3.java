package com.neotech.lesson06;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		
		Scanner largeNumber = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		
		int num1 = largeNumber.nextInt();
		
		System.out.println("Please enter another number: ");
		
		int num2=largeNumber.nextInt();
		
		if(num1>num2) {
			
			System.out.println(num1+" is larger than "+num2);
		}
		
		else if(num2>num1) {
			
			System.out.println(num2+" is larger than "+num1);
		}
		
		else {
			
			System.out.println(num1+" and "+num2+" is equal");
		}

	}

}
