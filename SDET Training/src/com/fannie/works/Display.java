package com.fannie.works;

public class Display {
	public static void displayItem(Item item){
		System.out.println(item);
		
		if(item instanceof Cake){
			((Cake)item).mixIngredients();
		}
		
		if(item instanceof Cookie){
			((Cookie)item).makeCookie();
		}
	}

}
