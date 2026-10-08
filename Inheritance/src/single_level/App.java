package single_level;
  public class App {
   public static void main(String args[]) {
	   //Accessing only parent class properties using the parent class object.
	   Person p1=new Person();
	   System.out.println(p1.age);
	   p1.walk();
	   
	   System.out.println();
	   //Accessing both parent class and child class properties using the child class object
	   
	   Student s1=new Student();
	   System.out.println(s1.name);
	   s1.learn();
	   s1.walk();
	   System.out.println(s1.age);
   }
}
