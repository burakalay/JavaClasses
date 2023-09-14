package ReplitChallenges;

import java.util.Scanner;

public class CatDog {

	public class Main {
		  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    // WRITE YOUR CODE HERE
		    
		    System.out.println("enter your input: ");
		  String word = scan.next();
		     boolean result=true;
		    int catCount=0;
		    int dogCount=0;

		    for(int i=0; i<word.length(); i++) {
		      if(word.contains("cat")) {

		        catCount++;
		      }
		    }
		      for(int i=0; i<word.length(); i++) {
		      if(word.contains("dog")) {

		        dogCount++;
		      }
		    }

		    if(catCount==dogCount) {
		      result=true;
		    }else{
		      result=false;
		    }
		  }
		}
}
