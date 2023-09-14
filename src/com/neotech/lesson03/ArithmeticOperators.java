package com.neotech.lesson03;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int num1, num2; // declareing 2 variables
		
		// initialization
		
		num1 = 23;
		num2 = 5;
		
		// declaring a variable and assign the sum of two numbers
		
		int sum = num1 + num2; // addition
		int sub = num1 - num2; // subtraction
		int mult = num1*num2; // multiplication
		int div = num1/num2;  // division
		
		System.out.println("sum :"+sum);
		System.out.println("sub :"+sub);
		System.out.println("mult :"+mult);
		System.out.println("div :"+div);
		
		
		double d1, d2;
		
		d1 =23;
		d2 = 5;
		
		double double_result = d1/d2;
		
		System.out.println("doulbe result: "+double_result);
		
		double int_result = num1/num2;
		System.out.println("int result :"+int_result);
	}

}
