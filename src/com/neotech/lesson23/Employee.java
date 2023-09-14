package com.neotech.lesson23;

public class Employee {
	
	double salary;
	
	//this is parent behavior
	
	void getPaid()
	{
		System.out.println("The employee's salary is "+salary);
	}

}

class Contractor extends Employee
{
	
double hourlyRate;


void getPaid() 
{
System.out.println("The contractor's hourly rate is "+hourlyRate);	
}

}
class FullTimeEmployee extends Employee
{

}
