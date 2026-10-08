package non_primitive;

public class App {
      public static void main(String args[]) {
    	  //Upcasting
    	  Father f=new Son();
    	  System.out.println(f.age);
  //  	  System.out.println(f.height); //Not accessible 
    	  
    	  //DownCasting
    	  Son s=(Son) f;
    	  System.out.println(s.age);
    	  System.out.println(s.height);
    	  
      }
}
