package com.neotech.lesson22;

public class Division {

	private void mathProgram(int num1, int num2) {
		System.out.println(num1/num2);
	}
	private void mathProgram(int num1, int num2, int num3) {
		System.out.println((num1/num2)/num3);
	}
	
	private void mathProgram(int num1) {
		System.out.println(num1/2);
	}
	
	public static void main(String[] args) {
   
		Division d = new Division();
		
		d.mathProgram(30);
		d.mathProgram(20, 10);
		d.mathProgram(100, 10, 2);
		
	}

}
