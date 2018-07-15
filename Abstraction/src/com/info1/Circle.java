package com.info1;

public class Circle extends Shape{
	double radious;
	Circle(double r){
		radious=r;
	}
@Override
void area() {
	// TODO Auto-generated method stub
	double result=Shape.pi*radious*radious;
	System.out.println("the area of circle is :"+result);
}

}
