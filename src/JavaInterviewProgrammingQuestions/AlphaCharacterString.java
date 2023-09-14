package JavaInterviewProgrammingQuestions;

import java.util.Scanner;

public class AlphaCharacterString {

	public static void main(String[] args) {

	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("Input something");
	 int alphaChar=0;
	 String str = scanner.next();
	 
	 for(int i=0; i<str.length(); i++) {
		 
		 char c = str.charAt(i);
		 
		 if(Character.isLetter(c)) {
			 alphaChar++;
		 }
		 
		 
	 }
		System.out.println("The number of alpha characters in "+str+" is: "+alphaChar);
	}

}
