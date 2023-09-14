package com.neotech.lesson22;

public class RentingCar {
	
	
	public static void availableCars(String ccar, String sdmr, String sdmd) {
		System.out.println("These are the group of cars available: "+ccar+", "+sdmr+", "+sdmd);
	}

	public static void availableCars(int car1,int car2, int car3) {
		System.out.println("Available car number is: "+(car1+car2+car3));
	}
	
	public static void availableCars(String message) {
		System.out.println("Reservation status: "+message);
		
	}
	
	
	public static void main(String[] args) {
		
		
		RentingCar.availableCars("Your car has been booked!");
		RentingCar.availableCars(15, 10, 22);
		RentingCar.availableCars("Clio", "Egea", "Elysee");
		
		
	}
}
