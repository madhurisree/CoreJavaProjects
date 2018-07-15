package com.info;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc q1=new Abc();
		q1.a=10;
		q1.b=20;
		q1.show();
		
	}

}
class Abc{
	int a,b,q;
	public void show(){
		//int a,b;
		 q=a+b;
		System.out.println(""+q);
	}
}
