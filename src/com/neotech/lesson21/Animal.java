package com.neotech.lesson21;

public class Animal {

	String name, color;
	int age, weight;
	
	//some behaviours, functions and actions
	
	public void eat() {
		System.out.println("All animals eat");
	}
	
	public void sleep() {
		System.out.println("All animals sleep");
	}
	
	//a common method
	public void displayInfo() {
		System.out.println("name: "+name+" color: "+color+" age: "+age+" weight: "+weight);
		
	}
	
}
