package com.info.madhu;

import java.io.InputStreamReader;
import java.util.Scanner;

public class IfElseDemo {
	int number;
	public void result1(int number){
		int result;
		
		if(number!=0){
			if(number>70){
			result=number/6;
			System.out.println("first class student :"+result);
			System.out.println("congratulation");
		}
		
			else if(number>60){
				result=number/6;
				System.out.println("second class student :"+result);
			}
		
		
			else if(number>50){
				result=number/6;
				
				System.out.println("third class student :"+result);
			}
			else{
				System.out.println("fail student");
				System.out.println("need improve");
			}
		}
		}
		
	public static void main(String[] args) {
		
		IfElseDemo i=new IfElseDemo();
Scanner s= new Scanner(new InputStreamReader(System.in));
		System.out.println("enter score");
		//String s1=s.next();
		int a=s.nextInt();
		i.result1(a);
	//	System.out.println(" score :"+i);
		
			
	}
	}


