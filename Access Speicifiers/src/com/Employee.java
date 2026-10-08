package com;

public class Employee {
    int salary=50000;
     
    void work() {
    	System.out.println("Employee is working");
    }
    Employee()
        {
    	System.out.println("Employee object created");
    	}
    public static void main(String args[]) {
    	Employee e1=new Employee();
    	System.out.println(e1.salary);
    	e1.work();
    }
}
