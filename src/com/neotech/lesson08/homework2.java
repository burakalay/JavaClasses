package com.neotech.lesson08;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {

		//2. Write a program that asks user to enter his/her username and password until user enters them correctly.
        String username ="admin";
		String password ="password";
		
		Scanner scan = new Scanner(System.in);
		
		boolean successful = false;
		
		while(!successful) {
			System.out.println("Please enter your username");
			
			String enteredUsername = scan.nextLine();
			System.out.println("Enter your password");
			
			String enteredPassword = scan.nextLine();
			
			if(enteredUsername.equals(username)&&enteredPassword.equals(password)) {
				successful = true;
				System.out.println("You logged in...");
				
			}
			else {
				
				System.out.println("You entered wrong username or password. I don't tell which one was wrong...");
			}
			
			scan.close();
			
			
			
			
			
		}
		
		
	
	
		
		
	}

}
