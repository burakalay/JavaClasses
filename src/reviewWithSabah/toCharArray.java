package reviewWithSabah;

public class toCharArray {

	public static void main(String[] args) {
		
		String longStr = "I am very happy today because its a weekend";
	
		System.out.println("String length ---> " + longStr.length());
				
				char[] charArray = longStr.toCharArray();
				
				System.out.println("char[] length ---> " + charArray.length);
				
				//print the array 
				for (char el : charArray)
				{
					System.out.print(el + "|");
				}
				System.out.println();
				
				for (int i = 0; i < charArray.length; i++)
				{
					System.out.print(charArray[i] + "|");
				}
				System.out.println();
				
				
				//Task: print the whole array, but replace 'a' with 'e'
				//Dont use replace or replaceAll
				
				System.out.println("Print the whole array, but replace \"a\" with \"e\"");
				
				
				//write your code here

	}

}
