package com.neotech.lesson05;

public class Homework1 {

	public static void main(String[] args) {
		
		boolean isAllergic = false;
		int allergyType = 2; //1 peanut, 2 seafood, 3 bee, 4 lactose
		
		
		if(!isAllergic) {
			
			System.out.println("You're healty");
		}
		else {
			if(allergyType==1) {
				
				System.out.println("Don't eat peanut!!");
				
			}
			else if(allergyType==2) {
				
				System.out.println("Don't eat seafood");
			}
			
			else if(allergyType==3) {
				System.out.println("Don't approach towards bees");
			}
			else if(allergyType==4) {
				
				System.out.println("Don't consume lactose");
			}
			
			else {
				
				System.out.println("Unknown allergy type");
			}
			
			
			
			
		}
	
		
	}
	
}
