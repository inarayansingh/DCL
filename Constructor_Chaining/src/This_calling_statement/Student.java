package This_calling_statement;

public class Student {
   Student(int age){
	   this("Tom");
	   System.out.println("Age : "+age);
   }
   Student(double height){
	   this(20);
	   System.out.println("Height : "+height);
   }
   Student(String name){
	   System.out.println("Name :"+name);
   }
   
   public static void main(String args[]) {
	   Student s1=new Student(5.5);
   }
}
