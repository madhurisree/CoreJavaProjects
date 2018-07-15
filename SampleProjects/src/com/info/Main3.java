package com.info;

import java.util.Scanner;

public class Main3 {
	private int res=0;
	Main3(int x, int y){
		
		res=x+y;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("enter first number");
		a=s.nextInt();
		System.out.println("enter second number");
		b=s.nextInt();
		Main3 m=new Main3(a,b);
		System.out.println("addition of two numbers is"+m.res);
		

	}

}
