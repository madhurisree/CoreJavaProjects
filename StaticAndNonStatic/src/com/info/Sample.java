package com.info;

import java.util.Scanner;

public class Sample {
	private int i=20;
	private static int j=30;
	static {
		System.out.println("My name is sreenumadhuri");
	}
	{
		System.out.println("my name is sudheer");
	}
public static void m1(){
	System.out.println("static method");
}
public void m2(){
	System.out.println("non static method ");
}
Sample(int i,int j){
	i=i;
j=j;
	int result=i+j;
	System.out.println("this is the constructor :"+result);
}
public static void main(String[] args) {
	System.out.println(j);
	m1();
	Sample s=new Sample(10,20);
	Scanner s1= new Scanner(System.in);
int i=s1.nextInt();
	
	System.out.println(s.i);
	s.m2();
}
}
