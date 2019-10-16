package com.fannie.abstraction;

public class ShapeClient {
	public static void main(String[] args) {
		Shape shapes[] = new Shape[5];
		
		shapes[0] = new Circle(2);
		shapes[1] = new Circle(7);
		shapes[2] = new Rectangle(3, 4);
		shapes[3] = new Circle(9);
		shapes[4] = new Rectangle(41, 14);
		
		
		
		for(Shape shape : shapes){
			ShapeBL.display(shape);
		}
	}

}
