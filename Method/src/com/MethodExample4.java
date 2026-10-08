package com;

public class MethodExample4 {
	
     public int findsquare(int num) {
    	 int square=num*num;
    	 return square;
     }
     public static void main(String args[]) {
    	 
    	 MethodExample4 me4 =new MethodExample4();
    	 
    	 int result=  me4.findsquare(5);
    	
    	 System.out.println(result);
    	 
    	 System.out.println(me4.findsquare(6));
     }
}
