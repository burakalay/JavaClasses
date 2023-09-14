package com.neotech.lesson18;

public class Cat {
//Instance Variable
	
	String name = "Ballito";
	int weight;
	String color;
	
	String breed = "British";
	
	//methods, behaviours, functions
	void meow() {
		
		String word = "Meoww";
		System.out.println(word);
		
	}
	
	void displayCatInfo() {
		
		System.out.println("Name: "+name+" weight: "+weight+" color: "+color+ " breed: "+breed);
	}
	
}
