package com.info;

public class TestVoidMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printGrade(80);

	}

	private static void printGrade(double score) {
		// TODO Auto-generated method stub
		if(score>=98){
			System.out.println("congrats "+ 'A');
		}
		else if(score>=75){
			System.out.println("good "+ 'B');
		}
		else{
			System.out.println("need improve "+ "Fail");
		}
		
		
	}

}
