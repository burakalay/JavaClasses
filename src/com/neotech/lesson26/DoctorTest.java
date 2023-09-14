package com.neotech.lesson26;

public class DoctorTest {

	public static void main(String[] args) {

		Doctor doctor = new Doctor();
		doctor.setEmail("burakalay17@gmail.com");
		System.out.println(doctor.getEmail());
		
		doctor.setLicenceID(1254568742);
		System.out.println(doctor.getlicenceID());
	}

}
