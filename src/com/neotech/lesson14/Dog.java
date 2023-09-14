package com.neotech.lesson14;

public class Dog {
   
	String breed;
	String color;
	int age;
	String size;
	
	void eat() 
	{
		System.out.println(breed+" "+" is eating!");
	}
	
	void run()
	{
		System.out.println(breed+" "+" is running");
	}
	
	void breed()
	{
		System.out.println(breed+" "+" is breeding!");
	}
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.breed = "Maltese";
		dog1.color ="White";
		dog1.age=3;
		dog1.size="Medium";
		
		dog1.breed();
		dog1.run();
		dog1.eat();
	}
	
}


