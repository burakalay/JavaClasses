package com.neotech.lesson19;

public class StaticKeyword {
	
	//instance variables
	String color;
	int memory;
	
	//static variables
	static String brand;
	static boolean touchScreen;
	
	void displayInfo() 
	
	{
		System.out.println("We built a "+brand+" with "+memory+" GB with "+color+" color!" );
	}
	
	//inside static methods we cannot reference instance variables
		//we can only use static variables
		static void displayInfo_2()
		{
		//	System.out.println("We built a " + brand + " with " + memory + 
		//			"GB with " + color +" color!");
		
		System.out.println("Brand is " + brand + " and the touchscreen is " + touchScreen);
		
		}
		
		public static void main(String[] args) {
			
			//this is a local variable, we can distunguish it from other variables
			
			
			//we do not need to create an object for static variables
			brand = "Iphone";
			//we are in the same class - I dont have to add the className as Java 
			//know the variable
			StaticKeyword.touchScreen = true;
			
			//can I say this??
			//NO, we need an object to access instance variables
		//	StaticKeyword.color = "red";
			
			StaticKeyword iphone1 = new StaticKeyword();
			
			iphone1.memory = 64;
			iphone1.color = "red";
			
			iphone1.displayInfo();
			
			//can we use an object to change a static parameter
			//Yes, but it will change it for all objects
			//iphone1.touchscreen = false;
			//System.out.println(touchscreen);
			
			//can we call it without an object??? Yes
			//can I call directly without the className?? yes, because we are in the same class
			StaticKeyword.displayInfo_2();
			
			//we can call it this way, but it is not the right way to access a static method
			iphone1.displayInfo_2();
		
			
			displayInfo_2();
			
			
			
			
			
			
			
		}
	
	

}
