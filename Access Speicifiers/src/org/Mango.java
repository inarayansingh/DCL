package org;

import com.Fruit;

public class Mango extends Fruit {
	Mango(){
		System.out.println("Mango object created");
	}
	  public static void main(String args[]) {
   	   Mango m1=new Mango();
   	   System.out.println(m1.price);
   	   m1.ripe();
   	   
   	   
      }
}
