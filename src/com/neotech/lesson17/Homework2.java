package com.neotech.lesson17;

public class Homework2 {
/**
 * Homework 3: 
	Find out how many alpha characters are present in a String?
	Find number of words in string?

Homework 4:
	Write a java program to reverse String? Reverse a string word
	by word?

Homework 5:
	You have a String a = “Is it saturday? Is it raining? Do we have
	a Java Class today?” How would you find out how many
	sentences are in that String?
	
	    //[0-9] --> any numbers
		//[a-z] --> all lowercase letters
		//[A-Z] --> All uppercase letters
		//[a-zA-Z] --> all letters
		//[0-9a-zA-Z] -- All numbers and letters
		//[^0-9a-zA-Z] --> anything that is not a number or a letter
	    //[abc] -- same as -- [a-c]
		//[^abc]
		//. --> any character
		//\d --> same as [0-9]
		//\s --> a white space character 
		//\s+ --> one or more space
 */
	
	public static void main(String[] args) {
		
		
		String str = "Hello+656+5+6";
		
		String str2 = str.replaceAll("[^a-zA-Z]", ""); // ^ --> means, remove everyhing but this
		System.out.println("How many alpha character in that String --> "+str2.length());
		
		
		String str3 = "Is it saturday? Is it raining? Do we have a Java class today?";
		
		int sentenceCount=0;
		
		for (char a: str3.toCharArray()) {
			
			if(a == '.' || a== '!' || a=='?') {
				
				sentenceCount++;
			}
			
		}
		System.out.println(sentenceCount);
	}
	
	
}
