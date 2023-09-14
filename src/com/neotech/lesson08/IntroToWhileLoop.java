package com.neotech.lesson08;

public class IntroToWhileLoop {

	public static void main(String[] args) {
		
		int time =8;
		if (time<9) {
			
			System.out.println("Good Evening!");
		}
		
		
		while(time<12)
		{
			System.out.println(time);
			time++;
		}
		
		//time = time+2;
		//time +=2;
		
		//how can we wright numbers between 20 and 30?
		
		System.out.println("numbers between 20 and 30");
		
		int a =20;
		while(a<=30) {
			
			System.out.println(a);
			a++;
		}
		
		//how can i print numbers from 10 to 1?
		
		System.out.println("number from 10 to 1");
		
		int x=10;
		while(x>=1) {
			
			System.out.println(x);
			x--;
		}

	}

}
