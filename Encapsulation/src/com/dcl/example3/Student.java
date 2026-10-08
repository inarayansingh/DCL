package com.dcl.example3;

public class Student {
       private int age;    //Readable & writeable data (controlled access)
       private int marks=90;   //Read only data
       
	   public int getAge() {
		   return age;
	   }
	   public void setAge(int age) {
		   if(age>0) {
		   this.age = age;
	   }
		   else {
			   System.out.println("Invalid Age");
		   }
	   }
	   public int getMarks() {
		   return marks;
	   }
	   public void setMarks(int marks) {
		   this.marks = marks;
	   }
       
       
}
