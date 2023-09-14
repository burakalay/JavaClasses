package com.neotech.lesson08;

public class homework1 {

	public static void main(String[] args) {

		/*Write a program using while loop that calculates the sum of the even numbers between 0 and 10. */
		
		int x=0;
		int sum=0;
		
		while (x<=10) {
			
			if (x%2==0) {
			sum +=x;
			}
			x+=2;
		}
		
		System.out.println(sum);
		
	}

}
