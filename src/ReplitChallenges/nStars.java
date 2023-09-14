package ReplitChallenges;

import java.util.Scanner;

public class nStars {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n =scanner.nextInt();
		
		for(int i =0; i<n; i++) {
			System.out.print("*");
		}

	}

}
