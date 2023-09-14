package review5;

public class Task {
	
	void sayGreetingWithNumber(String greeting, int n) {
		
		for(int i =1; i<=n; i++) {
			
			System.out.print(greeting+" ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		
Task g = new Task();

g.sayGreetingWithNumber("hello", 15);

		
	}

}
