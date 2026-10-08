package com;

public class Car {
	
	//Non parameterized constructor
	
	public Car() {
		System.out.println("Car object created");
	}
	
	public static void main(String args[]) {
		System.out.println("Start");
		
		Car c1 = new Car();
		
		System.out.println("End");
	}

}
