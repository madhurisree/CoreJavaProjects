package com.info;

public class Point {
	// int x;
	// int y;
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
		// In the above example, parameter (formal arguments) and instance
		// variables are same that is why we are using this keyword to
		// distinguish between local variable and instance variable.
		// here instance variables and constructor parameters or orguments both
		// are same that time we will get Zero so that time
		// using this keyword

	}

	public void display() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(101, 102);
		Point p1 = new Point(103, 104);
		p.display();
		p1.display();

	}

}
