package com.neotech.lesson26;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp = new Employee();
		
		emp.setAge(25);
		System.out.println(emp.getAge());

		emp.setName("Burak Alay");
		System.out.println(emp.getName());
		
		emp.setSalary(10000);
		System.out.println(emp.getSalary());
 	}

}
