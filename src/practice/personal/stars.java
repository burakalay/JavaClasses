package practice.personal;

public class stars {

	public static void main(String[] args) {

		for (int row = 0; row < 3; row++) {

			for (int col = 0; col < 5; col++) {

				if (row == 1) {

					System.out.print("*   *");
					break;

				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}

	}

}
