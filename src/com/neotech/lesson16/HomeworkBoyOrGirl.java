package com.neotech.lesson16;

import java.util.Scanner;

public class HomeworkBoyOrGirl {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Mom's first name?: ");
	
	String mom = scanner.next();
	System.out.println("Dad's first name?: ");
	String dad = scanner.next();
	System.out.println("Boy or Girl?: ");
	String baby = scanner.next();
	
	if(baby.equalsIgnoreCase("boy")) {
		
		for(int i=0; i<=(dad.length()-1)/2; i++) {
			System.out.print(dad.charAt(i));
		}
	
		for(int i=0; i<=(mom.length()-1)/2; i++) { 
			System.out.print(mom.charAt(i));
		}
	
	}
	
	else if(baby.equalsIgnoreCase("girl")) {
		for(int i=0; i<=(mom.length()-1)/2; i++) { 
			System.out.print(mom.charAt(i));
		}
		
		for(int i=0; i<=(dad.length()-1)/2; i++) {
			System.out.print(dad.charAt(i));
		}
	}
	
}

}
