package com.neotech.lesson26;

public class RegistrationTest {

	public static void main(String[] args) {

		Registration reg1 = new Registration();
		
		reg1.setEmail("burakalay");
		reg1.setPassword("burakalay");
		reg1.setUsername("burakalay");
		
	    System.out.println(reg1.getPassword());
		System.out.println(reg1.getuserName());
		System.out.println(reg1.getEmail());
	
	}

}
