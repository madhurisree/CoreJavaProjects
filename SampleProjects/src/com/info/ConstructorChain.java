package com.info;

public class ConstructorChain {
	 public int a;
	public ConstructorChain(int a) {
		this.a =a;
		// TODO Auto-generated constructor stub
	}
}
	 class Chain extends ConstructorChain{
		
	private int b;
	public Chain(int a, int b) {
		// TODO Auto-generated constructor stub
		super(a);
		this.b=b;
	}
	public void show(){
		System.out.println("the value"+a);
		System.out.println("the value"+b);
	}
	}



