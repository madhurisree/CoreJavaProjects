package com.info;

import java.util.Scanner;

public class Calc {
//	public  static int  add(int number1, int number2){
//		int sum=0;
//		sum=(number1+number2)+17;
//		return sum;
//	}
//	int sum =0;
//	
//	Calc(int number1, int number2){
//		int sum =0;
//		sum=(number1+number2)*3;
//		System.out.println(sum);
//	}
private int number1;
private int number2;

	public int getNumber1() {
	return number1;
}

public void setNumber1(int number1) {
	this.number1 = number1;
}

public int getNumber2() {
	return number2;
}

public void setNumber2(int number2) {
	this.number2 = number2;
}
public void display(){
	int bod=0;
	bod= ((number1*number2)+number1)/2;
	System.out.println("the bodmas number is "+number1+" "+number2+" "+bod);
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c=new Calc();
		c.setNumber1(4);
		c.setNumber2(6);
		c.getNumber1();
		c.getNumber2();
		c.display();

	}

}
