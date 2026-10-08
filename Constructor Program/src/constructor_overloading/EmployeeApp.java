package constructor_overloading;

public class EmployeeApp {
    public static void main(String args[]) {
    	Employee e1=new Employee(101,"Virat");
    	Employee e2=new Employee(101,"Anuska","CEO");
    	Employee e3=new Employee(101,"Yogi","CM",10000);
    	
    	e1.displayDetails();
    	e2.displayDetails();
    	e3.displayDetails();
             	
//    	System.out.println("Employee Details");
//    	System.out.println("id :"+e1.id);
//    	System.out.println("name: "+e1.name);
//    	System.out.println("Desc :"+e1.desc);
//    	System.out.println("Salary : "+e1.salary);
//    	
//    	System.out.println("-----------------");
//    	System.out.println("Employee Details");
//    	System.out.println("id :"+e2.id);
//    	System.out.println("name: "+e2.name);
//    	System.out.println("Desc :"+e2.desc);
//    	System.out.println("Salary : "+e2.salary);
//    	
//    	System.out.println("-----------------");
//    	System.out.println("Employee Details");
//    	System.out.println("id :"+e3.id);
//    	System.out.println("name: "+e3.name);
//    	System.out.println("Desc :"+e3.desc);
//    	System.out.println("Salary : "+e3.salary);
//    	
    }
}
