package global_local_vars;

public class Kangaroo {
     double height=5.4;  //Global non static variables
     
     //this keyword:- it refers to the current object
     void m1() {
    	 double height=5.4;
    	 System.out.println(height);   //5.4
    	 System.out.println(this.height);  //4.4 &7.6 &17.6
     }
     public static void main(String args[]) {
    	 Kangaroo k1=new Kangaroo();
    	 k1.m1();
    	 
    	 System.out.println();
    	 
    	 Kangaroo k2=new Kangaroo();
    	 
    	 k2.height=7.6;
    	 k2.m1();
    	 
    	 System.out.println();
    	 
    	 Kangaroo k3=new Kangaroo();
    	 k3.height=8.8;
    	 k3.m1();
     }
}
