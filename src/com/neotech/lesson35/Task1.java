package com.neotech.lesson35;

class CantDriveException extends RuntimeException {
	
	public CantDriveException(String msg) {
		super(msg);
	}
	
	
}



public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create a method to check age eligibility that will throw a runtime exception.
		 * Method should throw an exception if age is less than 16.
		 */

		try {
			canIDrive(19);
			canIDrive(14);
		} catch (CantDriveException c) {
			System.out.println(c.getMessage());
		}

	}

	public static void canIDrive(int age)
	{
		if (age < 16)
		{
			//I should throw an exception
			//throw new RuntimeException("You cannot drive!"); 
			throw new CantDriveException("You cannot drive!");
		}
		else
		{
			System.out.println("Drive Safe!");
		}
	}

}
