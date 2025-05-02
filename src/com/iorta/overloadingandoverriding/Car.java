package com.iorta.overloadingandoverriding;

public class Car extends Vehicle{
	
	@Override
	void fuelEfficiency() {
		System.out.println("Car fuel efficiency");
	}
	
	@Override
	int fuelEfficiency(int distance, int fuel) {
		int efficiency = distance / fuel;
		System.out.println("Car fuel efficiency is ");
		return efficiency;
	}
}
