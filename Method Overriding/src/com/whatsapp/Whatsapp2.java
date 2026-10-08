package com.whatsapp;

class Whatsapp2 extends Whatsapp1 {
    @Override
    void message() {
    	super.message();
    	System.out.println("double tick supported");
    	
    }
    void call() {
    	System.out.println("Audio call Supported");
    }
}
