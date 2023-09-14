package com.neotech.lesson03;

public class StringConcatenation {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		String language = "pyton";
		
		System.out.println("I love "+language);
		System.out.println("I love Java");
		
		String s1 = "I love";
		String s2 = "Programming";
		
		// I'm sorry im gonna go back to my first love
		
		language = "Java"; //re-assignment
		
		System.out.println(s1+" " + language +" "+s2);
		
		// spacing in string
		
		System.out.println("Joyce");
		System.out.println("   Joyce");
		
		
		// String + number
		
		System.out.println("I am scared of "+13);
		
		String s3= "I am " +2; // I am 2
		String s4 = s3+5; // I am 25
		
		System.out.println(s3);
		System.out.println(s4);
		
		// Order of operations in String
		
		System.out.println("I have "+ 2 + 4+ " apples");
		System.out.println("I have "+ (2 +4)+ " apples");
		
	}

}
