package com.iorta.myowntest;

public class OverridingExample  {
	void sound() {
		System.out.println("Moo");
	}
	
	static class Dog extends OverridingExample {
		@Override
		void sound() {
			System.out.println("Bark");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingExample cow = new OverridingExample();
		OverridingExample dog = new Dog();
		
		cow.sound();
		dog.sound();
	}
}
