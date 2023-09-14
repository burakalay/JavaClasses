package JavaInterviewProgrammingQuestions;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input a word: ");
		String str = scanner.next();
		StringBuffer bf = new StringBuffer();
		
	bf.append(str);
String str2 = bf.reverse().toString();
		
	if(str.equals(str2)) {
		
		System.out.println("It's a palindrome!");
		
	}else {
		System.out.println("It's not a palindrome!");
	}
	}

}
