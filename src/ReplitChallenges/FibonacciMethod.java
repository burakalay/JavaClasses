package ReplitChallenges;

import java.util.*;

public class FibonacciMethod {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    fib(num);
  }
  
  public static void fib(int num){
    //WRITE YOUR CODE HERE

	  int[] fibonacci = new int[num + 1];
      fibonacci[0] = 0;
      fibonacci[1] = 1;
for(int i=2; i<=num; i++) {
fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
}  



    System.out.println(fibonacci[num]);

    




    
  }
}