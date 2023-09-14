package com.neotech.lesson06;

import java.util.Scanner;

public class task1 {
	
	public static void main(String[] args) {
		
		
		Scanner fullname = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		
		String name =fullname.next();
		
		System.out.println("Enter your second name: ");
		
		String surname = fullname.next();
		
		System.out.println("Your full name is "+name+" "+surname);
		
		
	}

}
