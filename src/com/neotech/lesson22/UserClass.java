package com.neotech.lesson22;

public class UserClass {
	/*
	 * Homework 4: Write program: UserClass that has a constructor that initializes
	 * instance variable name and mobile number. Create a subclass UserInfo that
	 * will have user address variable and it also being initialized through
	 * constructor call. Print users name, mobile number and address in userDetails
	 * method. Test your code.
	 */

	String name;
	int mobileNumber;

	public UserClass() {
	}

	public UserClass(String name, int mobileNumber) {

		this.name = name;
		this.mobileNumber = mobileNumber;
	}
}

class UserInfo extends UserClass {

	String adress;

	public UserInfo() {
	}

	public UserInfo(String name, int mobileNumber, String address) {
		super(name, mobileNumber);
		this.adress = address;
	}

	public void userDetails() {
		System.out.println("Name: " +name);
		System.out.println("Mobile Number: " +mobileNumber);
		System.out.println("Address: " + adress);
	}

	

}
