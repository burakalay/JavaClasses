package review5;

public class StringMethods {

	public static void main(String[] args) {
	
			String str = "Pershandetje";
			
			System.out.println(str.length());
			System.out.println(str.isEmpty());
			System.out.println(str.isBlank());
			
			System.out.println(str.toLowerCase());
			System.out.println(str.toUpperCase());
			
			System.out.println(str); // The original has not changed
			
			boolean equal = str.equals("PERSHENDETJE");
			System.out.println(equal);
			
			System.out.println(str.equalsIgnoreCase("PERSHANDETJE"));
			
			System.out.println("----------------------------------------");
			
			System.out.println(str.contains("sh"));
			System.out.println(str.contains("SH".toLowerCase()));
			
			boolean starts = str.startsWith("per");
			System.out.println(starts);
			
			System.out.println("Does Pershandetje start with Pershandetje?");
			System.out.println(str.startsWith("Pershandetje"));
			
			System.out.println("Does Pershandetje ends with E?");
			System.out.println(str.endsWith("E"));
			System.out.println();
			
			String name = "Burak"+"-"+"Alay";
			System.out.println(name);
			
			String name2 = "Burak".concat("-").concat("Alay");
			System.out.println(name2);
			
			String name3= "Burak".toUpperCase().concat("-").concat("Alay");
			System.out.println(name3);


			String str2="            Burak asked a question        ";
			System.out.println(str2.trim());
			System.out.println(str2.trim().length());
			
			System.out.println("----------------------------------------");
			
            String str3 = "Burak Alay";
            char letter = str3.charAt(2);
            System.out.println(letter);
            
            System.out.println(str3.indexOf('a'));
            
            int indexOfSecondA = str3.indexOf('a',2);
            System.out.println("Index of second a is: "+indexOfSecondA);
			
	}

}
