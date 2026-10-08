package com.whatsapp;

 class Whatsapp3 extends Whatsapp2 {
	 @Override
      void message() {
		  super.message();
    	  System.out.println("Blue tick supported");
    	
	 }
     @Override
      void call() {
    	 super.call();
    	  System.out.println("Video call supported");
      }
      void status() {
    	  System.out.println("status upload supported");
      }
}
