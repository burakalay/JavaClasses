package review5;

public class TestBurak {

	public static void main(String[] args) {
		
		Burak b = new Burak();
		b.addTwoNumbers();
		b.addTwoNumberThatIgive(7, 5);
		
		
		int res1=b.addTwoNumbersAndGiveMeTheResult();
		int res2=b.addTwoNumbersThatIGiveAndGiveMeTheResult(7, 5);
		
		
		System.out.println(res1);
		
		if(res2==12) {
			
			System.out.println("Good job Burak");
		}else {
			System.out.println("I still love you");
		}

	}

}
