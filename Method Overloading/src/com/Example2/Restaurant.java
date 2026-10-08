package com.Example2;

public class Restaurant {
        int burgerPrice=300;
        int FriesPrice=200;
        int cokePrice=70;
        
        void order() {
        	int bill=200;
        	System.out.println("*******BILL**********");
        	System.out.println("Deal of the day ordered");
        	System.out.println("Total : "+ bill);
        	System.out.println("-----------------------");
        }
        void order(int burgerQty) {
        	int bill=burgerQty* burgerPrice;
        	System.out.println("*******BILL***********");
        	System.out.println("Burger"+" X "+burgerQty);
        	System.out.println("Total : "+bill);
        	System.out.println("-----------------------");
        	
        }
        void order(int burgerQty,int friesQty) {
        	int bill=(burgerQty*burgerPrice)+(friesQty*FriesPrice);
        	System.out.println("**********BILL**********")	;
        	System.out.println("Burger"+" X "+burgerQty);
        	System.out.println("Fries"+" X "+friesQty);
        	System.out.println("Total : "+bill);
        	System.out.println("-----------------------");
        	
        	
        }
        void order(int burgerQty,int friesQty,int cokeQty) {
        	int bill=(burgerQty*burgerPrice)+(friesQty*FriesPrice)+(cokeQty*cokePrice);
        	System.out.println("**********BILL**********")	;
        	System.out.println("Burger"+" X "+burgerQty);
        	System.out.println("Fries"+" X "+friesQty);
        	System.out.println("Coke"+" X "+cokeQty);
        	System.out.println("Total :"+bill);
        	System.out.println("-----------------------");
        	
        	
        }
}
