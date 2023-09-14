package com.neotech.lesson12;

public class Homework2 {

	public static void main(String[] args) {
		// create an array on integers and calculate the sum of
		// all elements in an array

		int[] salaries = {150,175,350,950,357};
		
		int sum =0;
		
		for(int i=0; i<salaries.length; i++) {
			
			sum+=salaries[i];
		}
		System.out.println(sum);
		
		
		//second way
		
		int sum2=0;
		
		for(int num: salaries) {
			
			sum2+=num;
		}
		System.out.println("the sum in second way is "+sum2);
	}

}
