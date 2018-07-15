package com.info;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter marks");
		int marks=s.nextInt();
		if(marks>80 || marks <=100 && marks==80){
			System.out.println("keep it up weldone");
			
		}
		else if(marks>=60 && marks<=80){
			System.out.println("need to iprovement my chaild");
		}
		else{
			System.out.println("get out from my house");
		}
	}

}
