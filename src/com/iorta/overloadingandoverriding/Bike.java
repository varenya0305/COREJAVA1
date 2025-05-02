package com.iorta.overloadingandoverriding;

public class Bike extends Vehicle {
	@Override
	void fuelEfficiency() {
		System.out.println("Bike fuel efficiency");
	}
	
	@Override
	int fuelEfficiency(int distance, int fuel) {
		int efficiency = distance / fuel;
		System.out.println("Bike fuel efficiency is ");
		return efficiency;
	}
}
