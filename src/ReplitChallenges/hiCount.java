package ReplitChallenges;

import java.util.Scanner;

public class hiCount {

	public static void main(String[] args) {
		
		    Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();
		    // Write your code here
		int hiCount=0;
		String[] arr = str.split(" ");

		  for(String m: arr) {

			  if(m.contains("hi")) {
				  hiCount++;
			  }
		  
		  }

		
	}

}
