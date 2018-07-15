package com.info;

import java.util.Scanner;

public class ForLoop2 {
	public static int value(int value){
		int n = value;
		for(int i=0; i<=n; i++){
			System.out.println(i);
			value=i;
			//return i;
		}

		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int num=s.nextInt();
		int number=ForLoop2.value(num);
		/*for (int i : number) {
			System.out.println("number is "+i);	
*/		}
		
	}


