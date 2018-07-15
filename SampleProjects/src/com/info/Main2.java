package com.info;

import java.util.Scanner;

public class Main2 {
	
private int res=0;
	
	public  void add(int x, int y){
		res=x+y;
		System.out.println("result is :"+res);
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("enter first number");
		a=s.nextInt();
		System.out.println("enter second number");
		b=s.nextInt();
		Main2 m=new Main2();
		m.add(a, b);
	}

}
