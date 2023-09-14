package com.neotech.lesson17;

public class StringImmutable {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		str.concat(" World!");
		System.out.println(str);
		System.out.println(str.concat(" World"));
		
		str.toUpperCase();
		System.out.println(str);
		
		//we can do reassigning, but not change a string
		//str ---> was pointing at some string "Hello"
		str = str.concat(" World!");
		// str = str + "All"; ---> now str is pointing at a new string
		System.out.println(str);
		
		int a = 10;
		a = 5;
		//did I change 10??? No, we did not change 10, a was pointing to 10 
		//and now is pointing at 5
		String str2 = "Hello"; //actually pointing to the one created earlier
	}

}
