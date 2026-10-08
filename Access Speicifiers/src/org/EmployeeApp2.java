package org;

import com.Employee;

//Accessing default members from a differnt class (same package)

public class EmployeeApp2 {
	public static void main(String args[]) {
    	Employee e1=new Employee();
    	System.out.println(e1.salary);
    	e1.work();
    }
}
