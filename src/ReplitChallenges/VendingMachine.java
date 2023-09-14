package ReplitChallenges;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		/*

		Enter cents:
		95
		Your change is 3 quarters, 2 dimes, 0 nickels, and 0 pennies
		1-cent metal paraya penny denir.

		5-cent metal paraya nickel denir.

		10-cent metal paraya dime denir.

		25-cent metal paraya quarter denir.
		 */  
	
/*		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter cents: ");
		int input = scanner.nextInt();
		int quarter = input/25;
		int dimes = (input%25) / 10;
		int nickel = (input%25)%10/5;
		int penny = (input%25)%10%5;
		if (input%25==0 && input <100 && input>0) {
			System.out.println("Your change is "+input/25+" quarters "+dimes+" dimes "+nickel+" nickels and "+penny+" pennies");
		}
		
		else if(input%25!=0 && (input%25)%10==0) {
			
			System.out.println("Your change is "+quarter+" quarters "+dimes+" dimes "+nickel+" nickels and "+penny+" pennies");
		}
		
		else if (input%25!=0 && (input%25)%10!=0 && penny%5!=0) {
			
			System.out.println("Your change is "+quarter+" quarters "+dimes+" dimes "+nickel+" nickels and "+penny+" pennies");
		}
		
		else if(input%25!=0 && dimes%10!=0 && nickel%5!=0 && penny%5!=0) {
			System.out.println("Your change is "+quarter+" quarters "+dimes+" dimes "+nickel+" nickels and"+penny+" pennies");
		}
		
		else if(input>=100 || input<0) {
			System.out.println("Invalid cents amount");
		}
		
		else if (input<25 && dimes%10!=0 && nickel%5!=0 && penny%5!=0) {
			System.out.println("Your change is "+input/25+" quarters "+dimes+" dimes "+nickel+" nickels and "+penny+" pennies");
		}*/
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter cents: ");
	        int cents = scanner.nextInt();

	        if (cents >= 0 && cents < 100) {
	            int quarter = cents / 25;
	            int dime = (cents % 25) / 10;
	            int nickel = (cents % 25) % 10 / 5;
	            int penny = (cents % 25) % 10 % 5;
	            
	            System.out.println("Your change is " + quarter + " quarters, " + dime + " dimes, " + nickel + " nickels, and " + penny + " pennies");
	        } else {
	            System.out.println("Invalid cents amount");
	        }
	}

}
