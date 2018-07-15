package com.info;

import java.util.Scanner;

public class IntroMethod {/*
what is the use of method?
		means by using method one statement we can print many times by calling
		the method from main*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*firstMethod();
		firstMethod();
		firstMethod();
	}
public static void firstMethod(){
	System.out.println("my name is sreenumadhuri");
}*/
		/*myName("sreenuMadhuri");
		myName("hemanth");
		myName("chandra");
		int sum=addition(10, 5, 9);
		System.out.println("sum of values :"+sum);
		Scanner s=new Scanner(System.in);
		System.out.println("average is");
		double res=s.nextDouble();
		//IntroMethod.addition1();
		System.out.println(res);
		
	}
	public static void myName(String name){
		System.out.println("my name is :"+name);
	}
	
public static int addition1(int x, int y, int z){
	return (x + y +z);
}
public static double average(double x, double y, double z){
	double avg=(x+y+z)/3;
	return avg;
}
*/
		System.out.println("main method start");
		Scanner s=new Scanner(System.in);
		System.out.println("enter the values :");
		double x;
		double y;
		double z;
		double avg;
		x=s.nextDouble();
		y=s.nextDouble();
		z=s.nextDouble();
		avg=average(x, y, z);
		System.out.println("average number of given values :"+avg);
				
	}public static double average(double num1, double num2, double num3){
	double avg=(num1+num2+num3)/3;
	return avg;
}
	
	}
