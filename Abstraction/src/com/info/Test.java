package com.info;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Shape s= new Shape(); abstract class is not allowed object creation by using new keyword or new operator
		Shape s=new Rectangle();
	s.draw();
	s=new Traingle();
	s.draw();
	}

}
