package com.neotech.lesson10;

public class HotelNestedFor {
	
	public static void main(String [] args) {
		
		
		for (int floor=1; floor <=4; floor++) {
			
			System.out.println("Floor--> "+floor);
			
			    for (int room=1; room<=6; room++) {
			    	
			    	System.out.print(floor+"."+room+" ");
			    	
			    	
			    }
			System.out.println();
		}
		
		
		
	}

}
