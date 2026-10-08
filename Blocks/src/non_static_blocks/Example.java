package non_static_blocks;

public class Example {
	{
		System.out.println("inside non static block 1");
	}
	{
		System.out.println("inside non static block 2");
	}
	public static void main(String args[]) {
		
		//Example e2=new Example();
		System.out.println("inside main()");
		Example e1 =new Example();
	}
	{
		System.out.println("inside non static block 3");
	}
}
