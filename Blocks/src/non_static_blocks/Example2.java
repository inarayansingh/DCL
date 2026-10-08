package non_static_blocks;
  // Using non static block to initializing non static variables
public class Example2 {
	int x;
	{
		System.out.println("Initializing non static variable");
		x=10;
	}
	public static void main(String args[]) {
		Example2 obj1=new Example2();
		System.out.println(obj1.x);
		
		Example2 obj2=new Example2();
		System.out.println(obj2.x);
		
		Example2 obj3=new Example2();
		System.out.println(obj3.x);
	}

}
