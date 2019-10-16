package com.fannie.works;

public class Client1 {

	public static void main(String[] args) {
		Cake cake1 = new Cake(101, 
				"Red Velvet", 
				8.99, 
				"Single Piece", 
				false, 
				"Strawberry"
				);
		
		Cookie cookie1 = new Cookie(102, "Milk Chocolate", 4.50, "Pack", true, new String[] {"Almonds", "Peacan"});
		
	Display.displayItem(cake1);
	Display.displayItem(cookie1);
	
	}
	

}
