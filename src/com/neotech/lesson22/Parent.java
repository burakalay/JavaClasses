package com.neotech.lesson22;

public class Parent {

	String name = "Parent's Name";
	String lastName = "Parent's Lastname";
	
	void hello() {
		System.out.println("I am the parent class");
	}
	
	
}

class Child extends Parent{
	
	String name = "Child Name";
	
	void display() {
		
		System.out.println(name); // java adds this keyword in the background automatically
		System.out.println(this.name);
		System.out.println(super.name); // Parent's name
		System.out.println(super.lastName);
		System.out.println(lastName);
		System.out.println(this.lastName);
		           }
	void hello() {
		System.out.println("I am the child class");
	}
	void sayHello() {
		display(); //Java automatically adds this in front of the method
		hello();   //Java automatically adds this in front of the method
		super.hello(); //We are specifying that we want to call the hello()
		               //in the super class
	}
	
	
}
