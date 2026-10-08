package com;
//accessing public members from the same class
public class Student {
   public int age=20;
   public void learn() {
	   System.out.println("Learning java");
   }
   public Student() {
	   System.out.println("Student object created");
   }
   public static void main(String args[]) {
	   Student s1=new Student();
       System.out.println(s1.age);
	   s1.learn();
  }
}
