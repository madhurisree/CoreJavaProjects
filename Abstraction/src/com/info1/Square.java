package com.info1;

public class Square extends Shape {

Square(int h, int w){
	height=h;
	width=w;
}
@Override
void area() {
	// TODO Auto-generated method stub
	int result=height*width;
	System.out.println("the area is :"+result);
}
}
