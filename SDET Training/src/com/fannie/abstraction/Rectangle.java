package com.fannie.abstraction;

public class Rectangle implements Shape {

	private int len;
	private int bre;
	
	public Rectangle(int len, int bre) {
		this.len = len;
		this.bre = bre;
	}
	
	@Override
	public void area() {
		System.out.println("Area of Rectangle is " + len * bre);
		
	}

}
