package com.info;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BfExample {
	public static int m1(int a, int b){
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try {
	System.out.println("enter first valule");

	int x=Integer.parseInt(br.readLine());
	System.out.println("enter second value");
	int y=Integer.parseInt(br.readLine());
	System.out.println("add two valules"+(x+y));
} catch (NumberFormatException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
*/	
		Scanner s=new Scanner(new InputStreamReader(System.in));
		System.out.println("enter first number");
		int x=s.nextInt();
		System.out.println("enter second number");
		int y=s.nextInt();
		System.out.println("Add two values"+BfExample.m1(x, y));
		
	}

}
