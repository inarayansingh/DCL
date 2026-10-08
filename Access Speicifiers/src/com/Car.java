package com;

public class Car {
    private  int cost=2000;
   private   void start() {
    	  System.out.print("Car is starting");
      }
      
   private  Car(){
    	  System.out.println("Car object  created");
      }
      public static void main(String args[]) {
    	  Car c1=new Car();
    	  System.out.println(c1.cost);
    	  c1.start();
      }
}
