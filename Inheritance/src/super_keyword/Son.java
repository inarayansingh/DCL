package super_keyword;

 class Son extends Father {
     int age=20;
     
     void display() {
    	 int age=10;
    	 System.out.println(age);  
    	 System.out.println(this.age);
    	 System.out.println(super.age);
   
    	 
    	 
     }
     public static void main(String args[]) {
    	 Son s1=new Son();
    	 s1.display();
     }
}
