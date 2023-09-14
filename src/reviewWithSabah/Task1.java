package reviewWithSabah;

public class Task1 {

	public static void main(String[] args) {

		String str = "I am very happy because it's a weekend";
		
		char[] str2 = str.toCharArray();
		for (int i=0; i<str2.length; i++) {
			
			if(str2[i]=='a') {
				
				System.out.print('e');
			}
			else {
				System.out.print(str2[i]);
			}
			
		}
	}

}
