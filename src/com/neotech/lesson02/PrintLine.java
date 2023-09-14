package com.neotech.lesson02;

public class PrintLine {

	public static void main(String[] args) {
	
		int a = 10;
		int b = 7;
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a: " + a); // Çıktı: 7
		System.out.println("b: " + b); // Çıktı: 10

	}

}
