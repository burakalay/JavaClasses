package com.neotech.lesson10;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {

Scanner scanner = new Scanner (System.in);

  System.out.println("Please input a number: ");
  
  int input = scanner.nextInt();
  
      
  for(int i=1; i<=input; i++) {
	  
	  
	  for (int j=1; j<=i; j++) {
		  
		  System.out.print(i);
		  
		  }
	  System.out.println();
  }
  
  for(int i=input; i>=1; i--) {
	  
	  for(int j=1; j<=i; i++) {
		  
		  System.out.print(i);
	  }
	  System.out.println();
	  
  }

	}

}
