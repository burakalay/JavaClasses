package ReplitChallenges;

public class TwoDArray {

	public static void main(String[] args) {
		 int[][] ikiBoyutluDizi = {
				    {1, 2, 3},
				    {4, 5, 6},
				    {7, 8, 9}
				};

				for (int[] satir : ikiBoyutluDizi) {
				    for (int eleman : satir) {
				        System.out.print(eleman + " ");
				    }
				    System.out.println();
				    }

}
}