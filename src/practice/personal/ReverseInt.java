package practice.personal;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		
		int number;
		int reverse=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input a number: ");
         
	     number = input.nextInt();
		
	     int temp = number;
		int remainder = 0;
		
		while(temp>0) {
			
			remainder = temp % 10;
			reverse = reverse*10+remainder;
			temp /=10;
			
		}
		
		System.out.println(reverse);
		
	}

}
