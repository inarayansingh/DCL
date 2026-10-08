package This_calling_statement;
//this calling
 class Demo {
   Demo(){
	   System.out.println(1);
   }
   Demo(int a){
	   this();
	   System.out.println(2);
   }
   public static void main(String args[]) {
	       System.out.println("Start");
	   
	   		Demo d1=new Demo(10);
	   		
	   		System.out.println("End");
	   	
   }
}
