package com.neotech.lesson05;

public class ElseIfCondition {
	
	public static void main (String [] args) {
		
		
		double d1= 15.2;
		double d2 = 15.2;
		
		// conditions 
		
		if(d1>d2) {
			
			System.out.println("Number "+d1+" is greater than "+d2);
			
		} else if(d1<d2) {
			System.out.println("Number "+d1+" is less than "+d2);
		}
		
		else {
			
			System.out.println("Number "+d1+" is equal to "+d2);
		}
		
		
		
	}

}
