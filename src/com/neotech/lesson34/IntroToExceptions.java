package com.neotech.lesson34;

import java.io.FileInputStream;

public class IntroToExceptions {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		
		// System.out.println(a/b); This is an ArithmeticException: / by zero
		
		int[] array = {2,3,4};
		
		System.out.println(array[6]);
		
		//ArrayIndexOutOfBoundsException
		
		String filePath ="";
		
//		FileInputStream fis = new FileInputStream(filePath); FileNotFoundException
		
		NullPointerException npe = new NullPointerException();
		throw(npe);
		
		
		
	}

}
