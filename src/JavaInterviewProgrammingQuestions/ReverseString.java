package JavaInterviewProgrammingQuestions;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Neotech";
		
	for(int i=str.length()-1; i>=0; i--) {
		
		System.out.print(str.charAt(i));
}
	System.out.println();
	String str2 = "I love Java very much";
	
	String[] str3 = str2.split(" ");
	
	StringBuilder reversedWords = new StringBuilder();
	
	for(int i=str3.length-1; i>=0; i--) {
		
		reversedWords.append(str3[i]);
		
		if(i>0) {
			
			reversedWords.append(" ");
		}
		
	}
	
 System.out.print(reversedWords.toString());

	System.out.println("-------------------------------------------------");
	
	StringBuffer sb = new StringBuffer();
	
	sb.append("I love Java very much");
	
	System.out.println(sb.reverse());
	
	}
	
	
	public static String ReverseString(String str) {
		
	StringBuilder reversed = new StringBuilder();
	
	for(int i=str.length()-1; i>=0; i--) {
		reversed.append(str.charAt(i));
		
	}
	return reversed.toString();
		
	}

}
