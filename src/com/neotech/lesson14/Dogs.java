package com.neotech.lesson14;

public class Dogs {
	
	String breed, size;
	int age;
	
	void bite()
	{
		System.out.println(breed+" bites really hard");
	}
	void bark()
	{
		System.out.println(breed+ " is barking");
	}
	void hungry()
	{
		System.out.println(breed+" is starving");
	}

	public static void main(String[] args) {
	
		Dogs dog1 = new Dogs();
		Dogs dog2 = new Dogs();
		Dogs dog3 = new Dogs();
		
		dog1.breed="husky";
		dog2.breed="bulldog";
		dog3.breed="labrador";
		
		dog1.bite();
		dog2.bite();
		dog3.bite();
		
		System.out.println();
		dog1.bark();
		dog2.bark();
		dog3.bark();
		System.out.println();
		dog1.hungry();
		dog2.hungry();
		dog3.hungry();
		

	}

}
