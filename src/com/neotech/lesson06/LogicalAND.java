package com.neotech.lesson06;

public class LogicalAND {
	
	
	public static void main(String[] args) {
		
		//declare a number
		//if the number is between 1-10 --> number is small
		//if the number is between 11-100 --> number is medium
		//if the number is between 101-1000 --> number is large
		
		int num =3305;
		
		//if number is >= and <=10
		
		if(num>1 && num<=10) {
			
			System.out.println(num+" is small");
		}
		else if(num>10 && num<=100) {
			
			System.out.println(num+" is medium");
		}
        else if(num>100 && num<=1000) {
			
			System.out.println(num+" is large");
		}
		
        else {
        	
        	System.out.println(num+ " is out of range");
        }
		
		
		
	}

}
