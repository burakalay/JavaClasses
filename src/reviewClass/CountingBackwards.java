package reviewClass;

public class CountingBackwards {
	/*
	 * 4321 4321 4321 4321
	 */

	public static void main(String[] args) {

		for (int row = 1; row <= 4; row++) {

			for (int col = 4; col >= 1; col--) {

				System.out.print(col);

			}
			System.out.println();

		}
		System.out.println("------------------------------------");

		for (int row = 4; row >= 1; row--) {

			for (int col = 1; col <= 4; col++) {

				System.out.print(row);

			}
			System.out.println();

		}

	}

}
