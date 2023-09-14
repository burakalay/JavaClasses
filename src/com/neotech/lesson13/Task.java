package com.neotech.lesson13;

public class Task {

	public static void main(String[] args) {

		//Create a 2D array of integer type with 3 rows and 4 columns and 
		//print all values of the whole array.
		
		int[][] numbers = {
				{15,25,38,43},	
				{27,85,69,77},
				{11,49,63,99}
		                  };
		
		for (int[] row: numbers) {
			
			for (int col: row) {
				
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}

}
