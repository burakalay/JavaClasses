package com.neotech.lesson17;

public class Homework {
	/**
	 * Homework 2:
    Write a program to print out the following conversion:
    Today is Tuesday and we have a Java Class!!!  to 
    yadoT si yadseuT dna ew evah a avaJ !!!ssalC.
    You can use any other string as long as the format is correct.
	 * 
	 */

	public static void main(String[] args) {

		String str = "Today is Tuesday and we have a Java Class!!!";
		
		System.out.println(str);
		
		//1st way of doing reverse string StringBuffer
		
		StringBuffer strBuffer = new StringBuffer(str);
		StringBuffer reverse = strBuffer.reverse();
		
		System.out.print(reverse);
		
		System.out.println();
		//2nd way of doing reverse string StringBuilder
		
		StringBuilder strBuilder = new StringBuilder(str);
		
		StringBuilder reverse2= strBuilder.reverse();
		System.out.print(reverse2);
		
		//3rd way of doing reverse string charAt
		
		System.out.println();
		
		for (int i=str.length()-1; i>=0; i--) {
			
			System.out.print(str.charAt(i));
			
			}
		
		System.out.println();
		
		//4th way of doing reverse string  toCharArray
		
		char[] arr = str.toCharArray();
		
	  for (int i =arr.length-1; i>=0; i--) {
		  
		  System.out.print(arr[i]);
	  }
		
		
	}
      

	}

