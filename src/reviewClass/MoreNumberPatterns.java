package reviewClass;

public class MoreNumberPatterns {

	public static void main(String[] args) {
		/*
		 * 1 22 333 4444
		 * 
		 * 
		 */
		for (int row = 1; row <= 4; row++) {

			for (int col = 1; col <= row; col++) {

				System.out.print(row);
			}
			System.out.println();
		}
		System.out.println("--------------------------------");

		for (int row = 1; row <= 4; row++) {

			for (int col = 4; col >= row; col--) {

				System.out.print(row);
			}
			System.out.println( );
		}
		
		System.out.println("--------------------------------------");
		
		
	}

}
