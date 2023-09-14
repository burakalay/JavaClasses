package practice.personal;

import java.util.Scanner;

public class Zombie2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inhabitants = scanner.nextInt();
		
		System.out.println("Day 0"+"["+inhabitants+"]");
		
		for(int day=1; inhabitants>0; day++) {
			
				inhabitants /=2;
				
				if(inhabitants>0) {
					System.out.println("Day "+day+"["+inhabitants+"]");
				}
			
		}
		
		System.out.println("---- EXTINCT ----");
		
	    }

	}


