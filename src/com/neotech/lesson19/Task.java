package com.neotech.lesson19;

public class Task {
        /**
		 * Create a method that will accept an array as parameters
		 * and will return a sum of all elements from that array.
		 * Method should be visible only within the same package
		 * and accessible by creating an instance of the class.
		 * Call this method from inside the class and another class
		 * in the same package.
		 */
		
	
	
	int sumOfElements(int[] arr) {
		int sum=0;
		for(int i =0; i<arr.length; i++) {
			
			sum+=arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Task obj1 = new Task();
		
		int oley[] = {1,2,3,4,5};
		
	int sum=obj1.sumOfElements(oley);
	System.out.println(sum);
	}
	
}
