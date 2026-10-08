package static_blocks;

//Initializing static variables using static block
public class Demo2 {
	static int a; // 0 -> 20 -> 40 -> 60
    static {
    	a=20;
    }
    public static void main(String  args[]) {
    	System.out.println(a);
    	a=60;
    	System.out.println(a);
    }
    static {
    	a=40;
    }
}
