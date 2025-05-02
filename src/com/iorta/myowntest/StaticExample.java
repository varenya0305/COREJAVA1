package com.iorta.myowntest;

public class StaticExample{
	 CarStaticExample car = new CarStaticExample();
	
	 void method() {
		car.start();
	}
	 
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int wheels = CarStaticExample.wheels;
	}
}
