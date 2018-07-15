package com.info;

public class SubClass extends SuperClass {
	public void printMethod(){
		super.printMethod();
		System.out.println("sub class method is invoked");
	}
//super is used invoke the superclass method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass s=new SubClass();
		s.printMethod();

	}

}
