package com.neotech.lesson30;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class Homework3 {
/**
 * Create a set collection that will hold objects of students type.
 * in this set we do not care about the insertion order. each students
 * object should have name and studentID. Display name of each student.
 * @param args
 */
	public static void main(String[] args) {

		Set<Student> students = new HashSet<>();
		students.add(new Student("Ahmet", 1));
		students.add(new Student("Yasemin", 2));
		students.add(new Student("Merve", 3));
		students.add(new Student("Ogulcan", 4));
		
		
		Iterator<Student> it = students.iterator();
		
		while(it.hasNext()) {
			Student student = it.next();
			System.out.println(student.getName());
			
		}
	}

}
class Student
{
	private String name;
	private int StudentId;
	
	Student(String name, int StudentId) {
		this.name=name;
		this.StudentId=StudentId;
	}
	
	
	//getter: no arguments, returns something
	//setter: arguments, doesn't return anythnig
	
	String getName() {
		return name;
	}
	
	
	
	
	
	
	
}