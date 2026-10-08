package com;
import java.util.Scanner;

public class Employee {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Employee Details");
		System.out.println("Enter id : ");
		int id=scan.nextInt();
		System.out.println("Enter Name : ");
		scan.nextLine();
		String name=scan.nextLine();
		System.out.println("Enter email : ");
		String email=scan.next();
		System.out.println("Enter desc : ");
		String desc=scan.next();
		System.out.println("Enter salary : ");
		double salary=scan.nextDouble();
		
		System.out.println("Employee Details ");
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(desc);
		System.out.println(salary);




		

		
		
	}

}
