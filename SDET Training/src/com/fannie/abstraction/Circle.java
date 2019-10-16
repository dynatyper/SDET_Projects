package com.fannie.abstraction;

public class Circle implements Shape{
	private int rad;

	public Circle(int rad) {
		this.rad = rad;
	}

	@Override
	public void area() {
		System.out.println("Area of Circle is " + (3.14 * rad * rad));
		
	}

}
