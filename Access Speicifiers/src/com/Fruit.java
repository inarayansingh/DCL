package com;

public class Fruit {
       protected int  price=100;
       protected void ripe() {
    	   System.out.println("Fruit is rippening");
       }
       protected Fruit() {
    	   System.out.println("Fruit object created");
       }
       public static void main(String args[]) {
    	   Fruit f1=new Fruit();
    	   System.out.println(f1.price);
    	   f1.ripe();
       }
}
