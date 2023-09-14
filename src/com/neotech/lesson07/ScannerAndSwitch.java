package com.neotech.lesson07;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String country;
		
		System.out.println("Where are you from?: ");
		country = scan.next();
		
	/*	if (country.equals("Albania")) {
			
			System.out.println("You speak Albanian");
		}
		else if (country.equals("USA")) {
			
			System.out.println("You speak English");
		}
		
		else {
			
			System.out.println("I don't know what language you speak");
		}*/
		
		//using switch
		
		
		
		switch (country) {
		case "albania":
			System.out.println("You speak Albanian");
			break;
		case "USA":
		case "UK":
		case "Australia":
			
			System.out.println("You speak English");
			break;
		case "Turkiye":
			System.out.println("You speak Turkish");
			break;
		default:
			System.out.println("I don't know your language");
			break;
		}
	}

}
