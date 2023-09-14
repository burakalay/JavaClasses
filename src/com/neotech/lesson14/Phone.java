package com.neotech.lesson14;

public class Phone {
	
	String brand, size;
	int salary;
	
	
	void ring()
	{
		System.out.println(brand+" is ringing");
	}
	void call()
	{
		System.out.println(brand+" calls");
	}
	void games()
	{
		System.out.println(brand+" has great games!");
	}

	public static void main(String[] args) {


		Phone iphone = new Phone();
		Phone android = new Phone();
		Phone nokia = new Phone();
		
		iphone.brand="iPhone";
		android.brand="Android";
		nokia.brand="Nokia";
		
		iphone.salary=100000;
		android.salary=50000;
		nokia.salary=0;
		
		iphone.size="medium";
		android.size="big";
		nokia.size="tiny";
		
		iphone.call();
		android.call();
		nokia.call();
		
		iphone.games();
		android.games();
		nokia.games();
		
		iphone.ring();
		android.ring();
		nokia.ring();
		

	}

}
