package JavaInterviewProgrammingQuestions;

public class FibonacciSeries {

	public static void main(String[] args) {

		/**
		 * . Write a Java Program to print the first 10 numbers of Fibonacci series
		 * 
		 * Fibonacci series: The next number is the sum of two previous numbers
           You have to print -> 1,1,2,3,5,8,13,21,34,55…
         * 
		 */
		
		
        int n = 10; // Number of Fibonacci numbers to generate
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
		
	}

}
