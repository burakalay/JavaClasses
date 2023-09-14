package com.neotech.lesson12;

public class RetrieveElements {

	public static void main(String[] args) {

		String[] fruits = {"Apple","Orange","Tomato","Cucumber"};
		
		for (int i=0; i<fruits.length; i++) {

			if(fruits.equals("Orange")) {
				
				System.out.println(fruits+" is my favorite fruit");
			}
			else {
				System.out.println(fruits);
			}
			
		}
	}

}
