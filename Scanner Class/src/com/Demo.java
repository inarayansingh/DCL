package com;

import java.util.Scanner;

public class Demo {
      public static void main(String args[]) {
    	  System.out.println("Start");
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter num1: ");
    	  int a=sc.nextInt();
    	  System.out.println("Enter num2: ");
    	  int b=sc.nextInt();
    	  int sum=a+b;
    	  System.out.println("The sum of given no. :" +sum);
    	  System.out.println("End");
      }
}
