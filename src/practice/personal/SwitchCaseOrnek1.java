package practice.personal;

public class SwitchCaseOrnek1 {
	
	public static void main(String[] args) {
		
		int score =100;
		
		String Final;

		switch (score / 10) {
		
		case 9:
		case 10:
			Final = "Excellent";
			break;
		case 8:
			Final = "Good";
			break;
		case 7:
			Final = "Enough";
			break;
		case 6: 
			Final = "Passed";
			break;
		default:
			Final = "Failed";
			break;
		
		}
		
	
          System.out.println("Final: "+Final);
}
	
}
