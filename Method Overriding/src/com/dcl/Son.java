package com.dcl;

 class Son extends Father{
	@Override
     void bike() {
    	 System.out.println("Son's chappri bike");
     }
	@Override
	void eat() {
		System.out.println("Son is eating");
	}
	//new method declared in the child class
	void run() {
		System.out.println("Son is running");
	}
}
