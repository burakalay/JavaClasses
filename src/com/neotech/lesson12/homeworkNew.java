package com.neotech.lesson12;

public class homeworkNew {

	public static void main(String[] args) {
		/*2. Create a 2D array that first row will contain 4 names and second row will contain grades, all Strings.
		Then you program should print name of the students that has A and B grade*/
		
		
		String[][] students = {
				
				{"Wilfred Zaha", "Edin Dzeko", "Arda Güler", "Ferdi Kadıoğlu"},
				{"A","B","C","A"}
				
				};
		for(int i=0; i<students[1].length; i++) {
			
			if(students[1][i].equals("A") || students[1][i].equals("B"))
			{
				System.out.println(students[0][i]+" : "+students[1][i]);
			}
			
			
			
		}
		

	}

}
