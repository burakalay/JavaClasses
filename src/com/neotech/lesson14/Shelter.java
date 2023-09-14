package com.neotech.lesson14;

public class Shelter {
	
	public static void main(String[] args) {
	
	//create 3 objects using the Dog class
	
	Dog dog1= new Dog();
	Dog dog2=new Dog();
	Dog dog3=new Dog();
	dog1.breed="Mastiff";
	dog1.size="Small";
	dog1.color="black";
	dog1.age=2;
	
	dog2.breed="French Bulldog";
	dog2.size="Big Boy";
	dog2.color="White";
	dog2.age=4;
	
	dog3.breed="Pitbull";
	dog3.size="Medium";
	dog3.color="Gray";
	dog3.age=5;
	
	dog1.eat();
	dog1.breed();
	dog1.run();
	
	dog2.eat();
	dog2.breed();
	dog2.run();
	
	dog3.eat();
	dog3.breed();
	dog3.run();
	
	
	

}

}