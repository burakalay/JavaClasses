package com.neotech.lesson04;

public class RelationalEqualityOperators {

	public static void main(String[] args) {
		
		// is 6<8
		
		System.out.println(6<8);
		
		int a=6;
		int b=8;
		
		System.out.println(a<b);
		System.out.println(a>b);
		
		int c = 8;
		System.out.println(c==b); // means equal (not assignment)
		System.out.println(c!=b); // means not equal (different)
		
		double d1 = 10.5;
		double d2 = 10.5;
		
		boolean res1 = d1>d2;
		System.out.println(res1);
	}

}
