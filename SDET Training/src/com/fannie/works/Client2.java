package com.fannie.works;

public class Client2 {
	public static void main(String[] args) {
		Item[] items = new Item[5];
		
		items[0] = new Cake(101, "Honey", 4.55, "Single", true, "Honey");
		items[1] = new Cake(102, "Red Velvet", 8.99, "Single", true, "Chocolate");
		items[2] = new Cookie(103, "Dark", 4.20, "Single", true, new String[]{"Almonds"});
		items[3] = new Cake(104, "Honey", 6.20, "Single", true, "Honey");
		items[4] = new Cake(105, "Milk", 4.89, "Single", true, "Honey");
		
		
		for(Item item : items){
			Display.displayItem(item);
			System.out.println("----------------------");
		}
	}

	
}
