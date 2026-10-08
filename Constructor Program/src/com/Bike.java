package com;

public class Bike {
	
	//parameterized custom constructor
	Bike(int a){
		System.out.println("Bike object created");
	}
	public static void main(String args[]) {
		System.out.println("Start");
		
		Bike b1=new Bike(45);
		
		
		System.out.println("End");
	}

}
