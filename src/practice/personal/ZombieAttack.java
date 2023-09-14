package practice.personal;

import java.util.Scanner;

public class ZombieAttack {

	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	    int inhabitants = scan.nextInt();

	    //WRITE YOUR CODE HERE
	    // 

	    int day=0;
			System.out.println("Day "+day+"["+inhabitants+"]");
		     while(inhabitants!=0) {
					day++;
					inhabitants=inhabitants/2;
					if(inhabitants==0) {
						System.out.println("---- EXTINCT ----");
					                   }
					else {
	         System.out.println("Day "+day+"["+inhabitants+"]");
					    }
	       }
	    if(inhabitants==0) {
	    	System.out.println("---- EXTINCT ----");
	    }
	
}
}