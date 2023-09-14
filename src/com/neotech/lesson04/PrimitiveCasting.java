package com.neotech.lesson04;

public class PrimitiveCasting {

	public static void main(String[] args) {

		//casting or converting
		
		//byte -- short -- int -- long -- float -- double
		
		double d1=3.7; // no casting happened
		
	System.out.println(d1);

	
	double d2=6;
	System.out.println(d2); // casting happened

	int num=5;
	double d3=num;
	System.out.println(d3);
	
	int num2 = (int) 6.5;
	System.out.println(num2);
	
	byte b1 = (byte) 4560;
	System.out.println(b1);
		
	long L1 = 17L;
	int number = (int) L1; // losing data??
	System.out.println(number);
	
	long L2 = 543253425234534L;
	int number2 = (int) L2; // losing data?
	System.out.println(number2);
	
		
	}

}
