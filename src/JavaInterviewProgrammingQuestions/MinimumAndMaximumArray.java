package JavaInterviewProgrammingQuestions;

public class MinimumAndMaximumArray {

	public static void main(String[] args) {

		/**
		 * 7. Write a java program to find the second largest number in the array? Maximum
              and minimum number in the array?
              
              Do it in one iteration.
		 */
		
		int[] arr = {234,231,132,123,298,34,38,41};
		
		int maximum = arr[0];
		int secLargest = arr[1];
		int min = arr[2];
		
		for(int i=0; i<arr.length-1; i++) {
			
			
			if(arr[i]> maximum) {
				
				maximum=arr[i];
			}
			else if(arr[i]<min) {
				
				min = arr[i];
				
			}
			else if (arr[i]<maximum && arr[i]>min) {
				secLargest = arr[i];
			}
		}
		System.out.println(maximum);
		System.out.println(min);
		System.out.println(secLargest);
		
		
	}

}
