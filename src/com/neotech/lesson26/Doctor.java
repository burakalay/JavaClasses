package com.neotech.lesson26;

public class Doctor {
	
	private long licenceID;
	private long phoneNumber;
	private String email;
	
	//setter for licenceID
	
	public void setLicenceID(long licenceID) {
		
		this.licenceID=licenceID;
	}
	
	//getter for licenceID
	public long getlicenceID() {
		return licenceID;
	}
	
	//getter for email
	
	public String getEmail() {
		return email;
	}
	
	//write a setter for email, only allow the change if, the new email must not be empty, email must contain @gmail
	
	public void setEmail(String email) {
		if(!email.isEmpty()) {
			if(email.contains("@gmail")) {
				this.email=email;
			}else //email doesn't contain @gmail 
				{
				System.out.println("You have to use @gmail");
			    }
		}else {
			System.out.println("Email cannot be empty!");
		}
	}
	
	//setter for phoneNumber
	public void setphoneNumber(long phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	
	//getter for phoneNumber
	
	public long phoneNumber() {
		return phoneNumber;
	}
	
	
	

}
