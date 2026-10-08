package com.dcl;

public class BankApp {
       public static void main(String args[]) {
    	   Bank b1=new Bank();
    	   
    	     System.out.println( b1.getAmount());
    	     b1.setAmount(20000);
    	     
    	     System.out.println( b1.getAmount());
    	     b1.setAmount(-10);
    	     
       }
}
