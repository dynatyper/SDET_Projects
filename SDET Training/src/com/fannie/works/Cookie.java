package com.fannie.works;

import java.util.Arrays;

public class Cookie extends Item{
	private String type;
	private boolean isSugarless;
	private String[] nuts;
	
	
	
	public Cookie(int id, String name, double price, String type, boolean isSugarless, String[] nuts) {
		super(id, name, price);
		this.type = type;
		this.isSugarless = isSugarless;
		this.nuts = nuts;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isSugarless() {
		return isSugarless;
	}
	public void setSugarless(boolean isSugarless) {
		this.isSugarless = isSugarless;
	}
	public String[] getNuts() {
		return nuts;
	}
	public void setNuts(String[] nuts) {
		this.nuts = nuts;
	}
	@Override
	public String toString() {
		return super.toString() + "Cookie [type=" + type + ", isSugarless=" + isSugarless + ", nuts=" + Arrays.toString(nuts) + "]";
	}
	
	public void makeCookie(){
		System.out.println("Cookies are being made...");
	}
	
}
