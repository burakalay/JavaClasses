package practice.personal;

import java.util.Scanner;

public class FindingMaximumInArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };
		// DO NOT TOUCH ABOVE
		// TODO: Write your code below.

		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > max) {
				max = nums[i];
			}

		}
		System.out.println("Max number: " + max);
	}

}
