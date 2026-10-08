package global_local_vars;

public class Person {
      String name;
      int age;
      
      Person(String name,int age){
    	  this.name=name;
    	  this.age=age;
    	  
      }
      public static void main(String args[]) {
    	  Person p1=new Person("Tom",20);
    	  System.out.println("Name: "+p1.name);
    	  System.out.println("Age: "+p1.age);
    	  
    	  System.out.println();
    	   
    	  Person p2=new Person("Smith",25);
    	  System.out.println("Name: "+p2.name);
    	  System.out.println("Age: "+p2.age);
      }
}
