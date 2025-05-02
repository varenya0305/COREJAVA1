package com.iorta.overloadingandoverriding;

public class Vehicle {

	void fuelEfficiency() {
		System.out.println("Generic fuel efficiency");
	}
	
	
	int fuelEfficiency(int distance, int fuel) {
		return distance / fuel;
	}
	
	int fuelEfficiency(String distance, int fuel) {
		return fuel;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create objects
		Vehicle myVehicle = new Vehicle();
		Car myCar = new Car();
		Bike myBike = new Bike();
		
		//Call the first fuelEfficiency method to display message
		myVehicle.fuelEfficiency();
		myCar.fuelEfficiency();
		myBike.fuelEfficiency();
		System.out.println("\n");
		
		//Call the overloading fuelEfficiency method to calculate fuel efficiency.
		System.out.println(myVehicle.fuelEfficiency(100, 10));
		System.out.println(myCar.fuelEfficiency(200, 2));
		System.out.println(myBike.fuelEfficiency(200, 25));
	}

}
