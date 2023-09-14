package ReplitChallenges;

import java.util.Scanner;

public class RepeaterInArray {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    //TODO: write your code below
		    int repeater=0;

		    for( int i=0; i<nums.length; i++) {
		      
		    	if(repeater == nums[i]) {
		    		System.out.println();
		    	}
		    	
		    }
		
		
	}

}
