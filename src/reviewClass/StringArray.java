package reviewClass;

public class StringArray {

	public static void main(String[] args) {

		String[] animals= {"dog","cat","elephant","mouse","horse"};
		
		for (int i=0; i<animals.length; i++) {
			
			System.out.println(animals[i]+" ");
			
		}
		
		for(String elements:animals) {
			
			System.out.println(elements+" ");
		}
		
		System.out.println("-------------------------------------");
		
		System.out.println("Let's print the animals in reverse order");
		
		for(int i=animals.length-1; i>=0; i--) {
			System.out.println(animals[i]+" ");
		}
		
	}

}
