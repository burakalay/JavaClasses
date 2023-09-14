package com.neotech.lesson13;

public class Task2 {

	public static void main(String[] args) {

		// Create a 2D array of integer type where you will
		// store odd and even numbers in 3 rows and 4 columns.
		// Develop a program which will identify/print the even numbers only.

		int[][] OddandEven = { { 3, 5, 7, 8 }, { 4, 12, 15, 19 }, { 96, 85, 78, 14 } };

		for (int[] row : OddandEven) {

			for (int col : row) {

				if (col % 2 == 0) {
					System.out.print(col + " ");
				}
			}
			System.out.println();
		}
System.out.println();
		// second way

		for (int row = 0; row < OddandEven.length; row++) {

			for (int col = 0; col < OddandEven[row].length; col++) {

				if (OddandEven[row][col]%2==0) {

					System.out.print(OddandEven[row][col]+" ");
				}
				
			}
			System.out.println();
		}
	}

}
