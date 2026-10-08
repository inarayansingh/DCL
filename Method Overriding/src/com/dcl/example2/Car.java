package com.dcl.example2;

 class Car extends Vehicle {
	 
     @Override
	 void start() {
  	   super.start();  //vehicle class method
  	   System.out.println("Car is starting");
  	   super.start();  //vehicle class method
}
 }
