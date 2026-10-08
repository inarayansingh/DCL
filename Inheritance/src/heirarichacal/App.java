package heirarichacal;

public class App {
	public static void main(String args[]) {
		Tiger t1=new Tiger();
		t1.type="Wild";
		t1.name="Sheru";
		t1.details();
		t1.eat();
		t1.sleep();
		t1.roar();
		t1.hunt();
		
		System.out.println();
		
		Cow c1=new Cow();
		c1.type="Domestic";
		c1.name="Punayakoti";
		c1.details();
		c1.moo();
		c1.graze();
		c1.eat();
		c1.sleep();
		
	}

}
