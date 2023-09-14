package com.neotech.lesson10;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {

	int sumEven = 0;
	int sumOdd =0;
	int total =0;
	
	for (int i =1; i<=20; i++) {
		
		
		if(i%2==0) {
			
			sumEven +=i;
		}
		else {
			sumOdd +=i;
		}
	         total+=i;
	
	}
	System.out.println("Sum of even numbers is: "+sumEven);
	System.out.println("Sum of odd numbers is: "+sumOdd);
	System.out.println("Sum of total numbers is: "+total);
	
	}

}
