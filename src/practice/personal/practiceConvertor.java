package practice.personal;

import java.util.Scanner;

public class practiceConvertor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int inputSecond, hours, minutes, seconds;
		hours=0;
		minutes=0;
		seconds=0;

		System.out.println("Enter seconds:");
		inputSecond = scanner.nextInt();

		if (inputSecond % 3600 == 0) {
			hours = inputSecond / 3600;

		} else if (inputSecond % 3600 != 0) {
			hours = inputSecond / 3600;
			minutes = (inputSecond % 3600)/60;
			seconds = inputSecond % 60;
		}

		System.out.println(hours + " hours," + " " + minutes + " minutes," + " and " + seconds + " seconds");

	}

}
