package JavaInterviewProgrammingQuestions;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean isPrime = true;
		System.out.println("Please enter a number: ");

		int number = scanner.nextInt();

		/*
		 * if(num%2!=0 && num%3!=0 && num%5!=0 && num%7!=0) {
		 * 
		 * System.out.println(num+" is prime!");
		 * 
		 * }
		 * 
		 * else if(num==2 || num==3 || num==5 || num==7) {
		 * System.out.println(num+" is prime"); }
		 * 
		 * else { System.out.println(num+" is not prime"); }
		 */
		if (number <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					isPrime = false;

				}
			}
		}

		if (isPrime) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}

}
