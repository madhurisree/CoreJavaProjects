package com.info;

import java.util.Scanner;

public class IfCondition {
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter test score");
		int testScore=s.nextInt();
		char grade;
		if(testScore>=90){
			grade='A';
			System.out.println("first class"+grade);
		}
		else if(testScore>=70){
			grade ='B';
			System.out.println("second class"+grade);
		}
		else if(testScore>=60){
			grade ='C';
			System.out.println("third class"+grade);
			
		}
		else {
			System.out.println("worst candidate");
		}
	}

}
