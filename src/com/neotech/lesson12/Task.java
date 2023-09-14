package com.neotech.lesson12;

import java.util.Arrays;

public class Task {

	public static void main(String[] args) {
		// maksimum number
		
		int[] numbers = {23, 56, -75, 16, 80, 70,-40};

        int maxNumber = numbers[0]; // Başlangıçta maksimum sayıyı ilk eleman olarak kabul ediyoruz

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.println("Maximum number: " + maxNumber);

//second way
        
        System.out.println("----------------------------------------");
       
        int[] numbers2 = {23, 56, -75, 16, 80, 70,-40};
        
        int max = Arrays.stream(numbers2).max().getAsInt();

        System.out.println("Maximum number: " + max);
        
     
//3rd way
        int[] numbers3= {23, 56, -75, 16, 80, 70,-40};
        
        int largest = numbers[0];
        
        for(int num: numbers) {
        	
        	if(num>largest) 
        	{largest = num;
        	
        	}
        	System.out.println(largest);
       
        }
	}

}
