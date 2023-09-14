package com.neotech.lesson06;
import java.util.*;

public class ScannerDemo {

	public static void main(String[] args) {
		

Scanner input = new Scanner(System.in);		
		
	System.out.println("Please input your name: ");
	//asking for input and saving the input in a String
	String name = input.next();
	
	System.out.println("Hello and welcome "+name);

	
	System.out.println("please enter your age: ");
	
	int age = input.nextInt();
	
	System.out.println(name+", you're "+age+" years old!!");
	
	
	System.out.println("Please enter your salary: ");
	
	double salary = input.nextDouble();
	
	System.out.println("Your salary is: "+salary);
	
	}

}
