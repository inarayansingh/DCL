package com;

import java.util.Scanner;

import com.sun.jdi.Method;

public class scan {
     public static void main(String args[]) {
    	 
    	 Scanner scan=new Scanner(System.in);
    	 /* Whenever we use nextLine() after any other nextxxxx() method
    	 *The input value will be consumed by the nextXX() method
    	 *but the \n (next line) will be automatically consumed by the
    	 *nextLine() Method.class
    	 *
    	 *nextLine()- it accepts the input a \n line is detected 
    	 *it gets terminated at any point where it detects 
    	 *  a \n(next line)
    	 *
    	 *To resolve this kind of scenarios we need to invoke one more 
    	 *nextline () before nextline() to consume the \n (next Line) and
    	 *let the other nextLine () accept the input data */
    	 
    	 System.out.println("Enter id : ");
    	 int id=scan.nextInt(); //input taken  will be 101\n
    	 System.out.println("Enter Full Name: ");
    	 scan.nextLine();  // to consume \n(next Line)
    	 String name=scan.nextLine(); // take input dynamic input data
    	 
    	 System.out.println();
    	 System.out.println(id);
    	 System.out.println(name);
    	 
    	 
    	 
    	 
     }
}
