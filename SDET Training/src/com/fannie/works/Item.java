package com.fannie.works;

public class Item {
	//instance variables
	private int id;
	private String name;
	private double price;
	
	public Item(){}
	
	//Constructor
	public Item(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	//Mutators
	public void setId(int id){
		if(id > 100){
			this.id = id;
		}else {
			System.out.println("Sorry, invalid value.");
			this.id = 100;
		}
	}
	
	public void setName(String name) {
		if(name.length() < 5){
			System.out.println("Sorry, NAme should be minimum of 5 characters");
			this.name = "No Name";
		}else {
			this.name = name;
		}
	}
	
	public void setPrice(double price) {
		if(price < 5.0){
			System.out.println("Sorry, Minimum price is $5");
			this.price = 5;
		}else {
			this.price = price;
		}
	}
	
	
	//Accessors
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
}
