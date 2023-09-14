package com.neotech.lesson05;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean isFriday = true;
		int day = 13;
		
		
		if (isFriday) {
			
			System.out.println("Today is Friday, I'll watch movie.");
			if (day==13) {
				
				System.out.println("The day is 13. I'll watch scary movie");
			}
			else {
			System.out.println("I'll watch comedy.");
				
			}
		}
		
		else {
			
			System.out.println("Today is not Friday, I'll study Java");
		}

	}

}
