package com.neotech.lesson21;

public class Dog extends Animal {

	String breed;
	
	public void bark() {
		System.out.println("only dogs bark");
		System.out.println("The breed is: "+breed);
	}
	
}
