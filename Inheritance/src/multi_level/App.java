package multi_level;

public class App {
    public static void main(String args[]) {
    	System.out.println("Properties accessed by Vehicle Object");
    	
    	
    	Vehicle v1=new Vehicle();
    	System.out.println(v1.brand);
    	v1.start();
    	v1.stop();
    	
    	System.out.println();
    	System.out.println("Properties accessed by Car Object");
    
    	
    	Car c1=new Car();
    	System.out.println(c1.brand);
    	System.out.println(c1.model);
    	c1.start();
    	c1.stop();
    	c1.openBoot();
    	
    	System.out.println();
    	System.out.println("Properties accessed by ElectricCar Object");
    
    	
    	ElectricCar ev=new ElectricCar();
    	System.out.println(ev.brand);
    	ev.start();
    	ev.stop();
    	System.out.println(ev.batteryType);
    	ev.chargeBattery();
    }
}
