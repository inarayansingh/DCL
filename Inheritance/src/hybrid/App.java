package hybrid;

public class App {
public static void main(String args[]) {
	College c1=new College();
	c1.details();
	
	System.out.println();
	
	Department d1=new Department();
	
	d1.details();
	
	System.out.println();
	
	Professor p1=new Professor();
	p1.details();
	
	System.out.println();
	
	Helper h1=new Helper();
	h1.details();
}
}
