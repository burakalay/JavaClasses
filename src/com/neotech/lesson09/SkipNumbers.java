package com.neotech.lesson09;

public class SkipNumbers {
	
	public static void main(String[] args) {
		
		//print numbers from 10 to 1, skip 3,6,9
		
		
		for( int i=10; i>=1; i--) {
			
			if(i==3 || i==6 || i==9) {
				
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("-------------------------------------------");
		
		//print numbers from 20 to 30 and skip between 23 and 28

		for (int i =20; i<=30; i++) {
			
			if(i>=23 && i<=28) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
