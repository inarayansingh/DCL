package com;

/*Demonstrating in this program that static properties are shared properties
 * among all the objects ,changes made to static variable age by 
 * p1 object is visible to p2 and p3 as well.
 */

public class Person {
     static int age=15;
     public static void main(String args[]) {
    	 
     
     Person p1=new Person();
     System.out.println(p1.age);
     p1.age=20;
     
     System.out.println(p1.age);
     Person p2=new Person();
     System.out.println(p2.age);
     
     Person p3=new Person();
     System.out.println(p3.age);
     
     }
}
