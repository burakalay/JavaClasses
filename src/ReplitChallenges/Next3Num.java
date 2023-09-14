package ReplitChallenges;

import java.util.Scanner;

public class Next3Num {

	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.println("enter number");
	    int num = inp.nextInt();
	    System.out.println("next 3 are:"); 
	    //Method declared here

 int[] nextThreeNumbers = int3(num);

for (int i : nextThreeNumbers) {
    System.out.print(i + " ");
}
}

	   //Declare your method here

	public static int[] int3(int num) {
		
		int[] result = new int[3];
		
		 for (int i = 0; i <3; i++) {
	            result[i]=num+i+1;
	        }
	return result;
	
	}
 
	  // Do not touch above

}
