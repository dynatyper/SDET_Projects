package com.fannie.utils;

public class Util {
	
	public static void sleep(int milliSeconds){
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
