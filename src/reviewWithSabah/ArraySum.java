package reviewWithSabah;

public class ArraySum {

	private int sumofArray(int[] myArray)
	{
		int sum=0;
		
		for (int el: myArray) {
			
			sum+=el;
			
		}
		
		return sum;
	}
	
	private static double averageofArray(int[] myArr) {
		
		/**
		 *  //Task3
	       //Create a method that will get an array of integers as input and 
	      //return the average as a double
	     //the method should be visible only within the same class and 
	    //should be accessed using the ClassName only.
		 */
		
		int sum =0;
		double average=0;
	for(double el: myArr) {
		
		sum+=el;
	}
		average=sum/myArr.length;
		
		return average;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {3,4,5,6,7,8};
		int[] arr2 = {10,20,30,40};
		
		ArraySum obj1 = new ArraySum();
		
	int sum= obj1.sumofArray(arr);
		
		System.out.println("Sum of array is: "+sum);
		
	double average = ArraySum.averageofArray(arr2);
	
	System.out.println("Average of arr2 is: "+average);
	}
	
	
	
}
