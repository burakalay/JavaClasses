package review4;

import java.util.Scanner;

public class Scanner2DArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("How many row do you want in an array?");
		int rows=input.nextInt();
		
		System.out.println("How many cols do you want in array?");
		
		int cols=input.nextInt();
		
		String[][] names = new String[rows][cols];
		
		 
		 for(int i=0; i<rows; i++) {
			 
			 for (int j=0; j<cols; j++) {
				System.out.println("please enter a name: ");
				names[i][j]= input.next();
				
			 }
			 System.out.println();
			 
		 }
		
		 for(String[] row: names) {
			 
			 for(String name:row) {
				 
				 System.out.print(name+" ");
				 
			 }
			System.out.println();
		 }
		 
	}

}
