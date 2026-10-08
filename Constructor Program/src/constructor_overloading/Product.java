package constructor_overloading;

 class Product {
	Product(){
		System.out.println("Shoes purchased successfully");
	}
	Product(int price){
		System.out.println("Shoes price: "+price);
	}
	Product(String brand){
		System.out.println("Brand: "+brand);
		
		
	}
	Product(String model,int discount){
		System.out.println("Model : "+model);
		System.out.println("Discount : "+discount +" % ");
	}

}
