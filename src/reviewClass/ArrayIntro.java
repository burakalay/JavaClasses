package reviewClass;

public class ArrayIntro {

	public static void main(String[] args) {

		int[] arr = new int[4];

		arr[2] = 3;
		arr[1] = 2;
		arr[0] = 4;
		arr[3] = 5;

		int sumArr = 0;

		for (int i = 0; i < 4; i++) {

			sumArr += arr[i];

		}

		System.out.println(sumArr);

		System.out.println("------------------------------");
		
		int[] arr2= {4,2,3,5};
		
		int sumArr2=0;
		
		for (int num: arr2) {
			
		   sumArr2+= num;
			
		}
		System.out.println(sumArr2);
	}

}
