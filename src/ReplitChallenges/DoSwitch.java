package ReplitChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class DoSwitch {

	public static void main(String[] args) {

		
		//Scanner in = new Scanner(System.in);
	    int [] arr = {1,2,3,4};
	     System.out.println(Arrays.toString(do_switch(arr)));
	  }


	 //Write method here

	public static int[] do_switch(int[] arr) {

int temp = arr[3];

int[] arr2 = arr;
arr2[3] = arr[0];
arr2[0]=temp;
	  

	  return arr2;
	}
		
	}


