package ReplitChallenges;

import java.util.Scanner;
/**
 * Given two strings, **word** and a separator **sep**, 
 * return a big string made of **count** occurrences of the word, 
 * separated by the separator string.
 * 
 * input: 
   Word
   X
   3

output: WordXWordXWord
 * 
 *
 */
public class RepeatSeperator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
	    
	    String result = "";
        for (int i = 0; i < count; i++) {
            result += word;
           if (i < count - 1) {
              result += separator;
          }
        }
        
        System.out.println(result);
	    
	    
	    
	}

}
