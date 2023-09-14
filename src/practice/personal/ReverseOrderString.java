package practice.personal;

public class ReverseOrderString {

	public static void main(String[] args) {

		/**
		 * Homework 1:
    Create a String and print it in reverse order (Sunday → yadnuS). 
    Solve it using charAt(), toCharArray()  and reverse() methods.
    Note:
        for charAt() and toCharArray() use String
        for reverse you have to declare a StringBuffer object
		 */
		
		String str = "Today is Sunday";
	
		for (int i=str.length()-1; i>=0; i--) {
	         		
		System.out.print(str.charAt(i));
		}
		System.out.println();
		
		// 2nd way: using toCharArray()
				char[] charArray = str.toCharArray();
				for (int i = str.length() - 1; i >= 0; i--) {
					char c = charArray[i];
					System.out.print(c);
				}
				System.out.println();
		
		//3rd way: using StringBuffer
				
				StringBuffer strBuffer = new StringBuffer(str);
				strBuffer.reverse();
				System.out.println(strBuffer);
				
				// 4th way: using StringBuilder
				StringBuilder strBuilder = new StringBuilder(str);
				strBuilder.reverse();
				System.out.println(strBuilder);
	}

}
