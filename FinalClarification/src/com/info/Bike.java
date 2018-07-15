package com.info;

public class Bike {
	final int speedLimit;
	static final int hp;
	static {
		hp = 60;
		System.out.println(hp);
	}

	Bike() {
		speedLimit = 120;// final variables intialized in constructor and block
	System.out.println(speedLimit);
	}
public static void main(String[] args) {
	Bike b=new Bike();
	
}
}
