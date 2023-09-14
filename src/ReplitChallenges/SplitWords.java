package ReplitChallenges;

public class SplitWords {

	public static void main(String[] args) {

		String word = "Javareally fun";
		
		String[] words = word.split(" ");
		
		for(String m: words) {
			System.out.println(m);
		}
		
	}

}
