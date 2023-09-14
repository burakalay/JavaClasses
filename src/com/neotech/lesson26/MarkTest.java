package com.neotech.lesson26;

public class MarkTest {

	public static void main(String[] args) {

		
		StudentA st1= new StudentA(55,60,70);
		StudentB st2= new StudentB(57,80,73,45);
		
		System.out.println(st1.getAverage());
		System.out.println(st2.getAverage());
		
		Marks st3 = new StudentA(85,79,63);
		System.out.println(st3.getAverage());
	}

}
