package com;

public class Student {
    static int age=20;
    static void learn() {
    	System.out.println("Learning static keywords");
    }
    public static void main(String args[]) {
    	System.out.println(Student.age);
    	Student.learn();
    	System.out.println(age);
    	learn();
    }
}
