package com.neotech.lesson12;

public class Recap {

	public static void main(String[] args) {
		
		int [] grades = new int[5];
		
		System.out.println("The sizze of the array is --> "+grades.length);
		System.out.println("Grade with index 2 is --> "+grades[2]);
		
		grades[2] = 100;
		grades[4]=15;
		grades[1]=34;
		grades[3]=67;

		System.out.println("The sizze of the array is --> "+grades.length);
		System.out.println("Grade with index 2 is --> "+grades[2]);
	
	System.out.println("Find the average of the grades----------");
	
	//1st way:
	
	int total =grades[0]+grades[1]+grades[2]+grades[3]+grades[4];
	
	int average = total/5;
	
	System.out.println(average);
	
	//2nd way - using for loop
	
	int sum=0;
	
	for(int i =0; i<grades.length; i++) {
		
		sum+=grades[i];
		}
	System.out.println(sum/grades.length);
	
	System.out.println("-----------------------------------------------");
	System.out.println();
	
	
	String[] cities = {"Tirana", "Ankara", "Rome","Washington","Moscow","Bern"};
	
	System.out.println("The size of index is: "+cities.length);
	
	//how can i print the last city?
	System.out.println("the last city in array is "+cities[cities.length-1]);
	System.out.println();
	
	//how would i print all the cities?
	
	
	for(int i =0; i<cities.length; i++) {
		
		System.out.println(cities[i]);
	}	
   System.out.println("Let us print cities in reverse order");
   
 
   for(int j=cities.length-1; j>=0; j--) {
	   
	   System.out.println(cities[j]);
   }
	   
	   
	}
	
	
	
	
	
	}


