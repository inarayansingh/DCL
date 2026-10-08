package heirarichacal;

public class Animal {
	String type;
	String name;
	
	void eat() {
		System.out.println(name+" is eating");
	}
	void sleep() {
		System.out.println(name+" is sleeping");
	}
	
	void details() {
		System.out.println("Animal type: "+type);
		System.out.println("Animal name: "+name);
	}

}
