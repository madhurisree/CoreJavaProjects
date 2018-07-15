package com.info;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter 5 values:");
		double[] prices= new double[5];
		prices[0]=s.nextDouble();
		prices[1]=s.nextDouble();
		prices[2]=s.nextDouble();
		prices[3]=s.nextDouble();
		double total=prices[0]+prices[1]+prices[2]+prices[3]+prices[4];
		System.out.printf("the total prices is $%5.2f",total);
		//System.out.println("the total prices is :"+total);

	}

}
