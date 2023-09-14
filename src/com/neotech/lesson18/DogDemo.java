package com.neotech.lesson18;

public class DogDemo {

	public static void main(String[] args) {

		
		Dog dog1 = new Dog();
		dog1.name="Dwight";
		dog1.age=4;
		
		dog1.displayDogInfo();
		Dog.breed="French bulldog";
		
		Dog dog2 = new Dog();
		dog2.name="Schrute";
		dog2.age=7;
		dog2.displayDogInfo();
		dog1.displayDogInfo();
		
	}
}
