package static_blocks;

 class Demo {
       static {
    	   System.out.println("inside the static block 1");
       }
       public static void main(String args[]) {
    	   System.out.println("inside the main()");
       }
       
       static {
    	   System.out.println("inside the static block 2");
       }
       static {
    	   System.out.println("inside the static block 3");
       }
}
