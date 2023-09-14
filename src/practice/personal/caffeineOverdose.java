package practice.personal;

import java.util.Scanner;

public class caffeineOverdose {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int oneDrink = 0;

		int overdose = 10000;
		System.out.println("Tell me how many cup of coffee you had?");

		oneDrink = scanner.nextInt();
		oneDrink *= 40;
		if (oneDrink == overdose) {
			System.out.println("You're death.");
		}

		else {
			System.out.println("You're alive, yet.");
		}
	}

}
