package com.fannie.exception;

public class ExceptionEx01 {
	public static void main(String[] args) {
		
		try{
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			
			int result = num1 / num2;
			
			System.out.println("Result: " + result);
			
			
		
		} catch(ArithmeticException ae){
			System.out.println("Denominator cannot be zero. " + ae.getMessage());
		}
		
		System.out.println("Some business logic...");
		
	}
}
