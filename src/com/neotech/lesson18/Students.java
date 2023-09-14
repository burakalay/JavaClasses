package com.neotech.lesson18;

public class Students {
	
	/**
	 * Create a Class called Students 
       ▪ Create three variables studentName, studentID and numberOfStudents (should be a static variable)
       ▪ Create three objects of the Students Class
       ▪ Set the value for studentName, studentID and increment the numberOfStudents for each object
       ▪ Print out total the number of students
	 */
String studentName;
int studentID;
static int numberOfStudents=0;


void printing() {
	
	System.out.println("Students name is: "+studentName+" Student id is: "+studentID+" and number of students is: "+numberOfStudents);
	
}

public static void main(String[] args) {
	Students s1 = new Students();
	Students s2 = new Students();
	Students s3 = new Students();

	s1.studentName="Burak";
	s2.studentName="Aslı";
	s3.studentName="Ballito";
	
	s1.studentID=2;
	s2.studentID=3;
	s3.studentID=4;
	
	s1.numberOfStudents++;
	s2.numberOfStudents++;
	s3.numberOfStudents++;
	
	System.out.println(numberOfStudents);
	
	
	
	
}

}
