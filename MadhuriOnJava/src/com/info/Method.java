package com.info;

public class Method {
	public static void hello(String name){
		System.out.println("hello :"+name);
	}
	public static void addition(int x,int y,int z){
		System.out.println("the addition is :"+(x+y+z));
	}
	public static int sub(int x, int y, int z){
		return (x-y-z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello("sreenu");
		Method.hello("madhu");
		addition(2,3,4);
		int sub=sub(7,4,6);
		System.out.println("sub is :"+sub);

	}

}
