package ReplitChallenges;

public class AverageArray {

	public static void main(String[] args) {
		
		// Do not touch above. Use array temps
		  // 80 88 88 84 82 78 60 68

		    int[] arr = new int[8];

		    arr[0]=80;
		    arr[1]=88;
		    arr[2]=88;
		    arr[3]=84;
		    arr[4]=82;
		    arr[5]=78;
		    arr[6]=60;
		    arr[7]=68;

		    double sum=0;
		    for (double num : arr) {

		      sum+=num;
		      }
		    System.out.println("The average is "+sum/arr.length);
		
		
	}
}
