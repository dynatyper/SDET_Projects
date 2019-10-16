package com.fannie.works;

public class Client {

	public static void main(String[] args) {
		
		//will initiate item in the heap mem
		Item item1 = new Item();
		
		item1.setId(101);
		item1.setName("A");
		item1.setPrice(1);
		
		
//		item1.id = "101";
//		item1.name = "Red Velvet Pastry";
//		item1.price = 5.6;
		
		System.out.println("Stored @" + item1.hashCode());
		System.out.println(item1);
		
		System.out.println("Id: " + item1.getId());
		System.out.println("Name: " + item1.getName());
		System.out.println("Price: " + item1.getPrice());
	}
}
