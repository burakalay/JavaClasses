package com.neotech.lesson12;

public class Homework3 {

	public static void main(String[] args) {
		// Create an array of countries, while retrieving all values
		// from an array print capital for each country
		
		String[] countries = {"United States", "France","Turkiye","Englan"};
		String[] capitals = {"Washington, DC","Paris","Ankara","London"};
		
		
		 for (int i =0; i<capitals.length; i++) {
			 
			 String country = countries [i];
			 String capital = capitals[i];

			 System.out.println("Capital of "+country+" is "+ capital);
			 
			 
		 }
		 
		 //second way
		 
		 for(String country2 : countries) {
			 
			 
			 
		 }

	}

}
