package ReplitChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class Populate {
/**
 * The **populate** method accepts an empty int array and populates it with numbers counting up.
Example:
```
populate(new int[3])
returns:[1,2,3]```
populate(new int[5])

returns:[1,2,3,4,5]
```
hint:

use a for loop and use the iterator as the current elements value.
 * @param args
 */
	public static void main(String[] args) {

		int [] i= new int[new Scanner(System.in).nextInt()]; 
	    i = populate(i) ;
	    System.out.println(Arrays.toString(i));
		
	}

	
	public static int[] populate(int[] r) {
		//Write your code here
  
for(int i=0; i<r.length; i++) {
	
	r[i]=i+1;
	
}


    return r;
		
	}	
	
}
