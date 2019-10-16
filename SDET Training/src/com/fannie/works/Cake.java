package com.fannie.works;

public class Cake extends Item{
	private String type;
	private boolean isEggless;
	private String flavor;
	
	
	
	public Cake(int id, String name, double price, String type, boolean isEggless, String flavor) {
		super(id, name, price);
		this.type = type;
		this.isEggless = isEggless;
		this.flavor = flavor;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isEggless() {
		return isEggless;
	}
	public void setEggless(boolean isEggless) {
		this.isEggless = isEggless;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	@Override
	public String toString() {
		return super.toString() + "Cake [type=" + type + ", isEggless=" + isEggless + ", flavor=" + flavor + "]";
	}
	
	public void mixIngredients(){
		System.out.println("Anything without Eggs is Eggless...");
	}
	
}
