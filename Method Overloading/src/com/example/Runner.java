package com.example;

 class Runner {
  public static void main(String args[]) {
	  Television tv = new Television();
	  tv.display();
	  tv.display(55);
	  tv.display(55.5);
	  tv.display(101, "Discovery");
	  tv.display("Man vs Wild", 8);
	  
	  
  }
}
