package practice.personal;

import java.util.Scanner;

public class CouintingAnimals {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
	   System.out.println("enter your input: ");
	  String word = scan.next();
	     boolean result;
	    int catCount=0;
	    int dogCount=0;
	
	    		for(int i=0; i<=word.length()-3; i++) {
				
				String m = word.substring(i, i+3);
			  if(m.equalsIgnoreCase("cat")) {
	        catCount++;
	      }else if(m.equalsIgnoreCase("dog")) {
	        dogCount++;
	      }
			}
			  if(dogCount==catCount) {
	        result=true;
	      }else{
	        result=false;
	      }
			  System.out.println(result);
	    
	  
	   
		 
		 
		  }
	}


