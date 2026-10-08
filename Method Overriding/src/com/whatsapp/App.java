package com.whatsapp;

public class App {
	public static void main(String args[]) {
//		Whatsapp3 w1=new Whatsapp3();
//		w1.call();
//		w1.status();
//		w1.message();
		
		Whatsapp1 w1=new Whatsapp1();
		w1.message();
		
		System.out.println("-----------");
		
		Whatsapp2 w2=new Whatsapp2();
		w2.message();
		w2.call();
		
		System.out.println("-----------");
		
		Whatsapp3 w3=new Whatsapp3();
		w3.message();
		w3.call();
		w3.status();
		
	}

}
