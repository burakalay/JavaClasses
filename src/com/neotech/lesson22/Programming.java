package com.neotech.lesson22;

public class Programming {

	String message;
	
	public Programming() {
		System.out.println("I love programming languages");
	}
	
   public Programming(String message){
		this.message=message;
		System.out.println("I love "+this.message);
		
	}
	
  
   
	public static void main(String[] args) {
		
		Programming p = new Programming();
		Programming p2 = new Programming("Java");
		
	}
	
}
