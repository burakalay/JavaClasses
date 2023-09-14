package com.neotech.lesson18;

public class InstanceVariableDemo {

	public static void main(String[] args) {

		InstanceVariable obj1 = new InstanceVariable();
		System.out.println(obj1.name);
		
		InstanceVariable obj2 = new InstanceVariable();
		obj2.name = "Emine";
		System.out.println(obj2.name);
		
	}

}
