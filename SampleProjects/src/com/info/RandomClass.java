package com.info;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int die1 , die2 ,countdie=0;

Random r=new Random();
for(double i=0; i<100; i++){

	die1=r.nextInt(6)+1;
	die2= r.nextInt(6)+1;

if(die1==die2){
	countdie++;
}
}
System.out.println("result "+countdie+ "print");
	}
	

}
