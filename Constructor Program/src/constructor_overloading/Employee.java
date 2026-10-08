package constructor_overloading;

 class Employee {
       int id;
       String name;
       String desc;
       double salary;
       
       Employee(int id,String name){
    	   this.id=id;
    	   this.name=name;
       }
       Employee(int id,String name,String desc){
    	   this.id=id;
    	   this.name=name;
    	   this.desc=desc;
       }
       Employee(int id,String name,String desc,double salary){
    	   this.id=id;
    	   this.name=name;
    	   this.desc=desc;
    	   this.salary=salary;
       }
       void displayDetails() {
    	   System.out.println("Employee Details");
    	//   System.out.println();
    	   	System.out.println("id :"+this.id);
    	   	System.out.println("name: "+this.name);
    	   	System.out.println("Desc :"+this.desc);
    	   	System.out.println("Salary : "+this.salary);
    	   	System.out.println("------------------");
       }
   
}
