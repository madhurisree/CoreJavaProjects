package com.info1;

public class Rectangle extends Shape {
	
	public Rectangle(int i,int m) {
		// TODO Auto-generated constructor stub
		height=i;
		width=m;
	}
	@Override
	void area() {
		// TODO Auto-generated method stub
		int result=height*width;
		System.out.println("the area of rectangle is :"+result);
	}
	

}
