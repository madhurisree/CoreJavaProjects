package com.info;

public class Max2 {
	public static int max(int num1, int num2){
		int result;
		if(num1>num2){
			result= num1;
		}else{
			result= num2;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=3;
		int j=4;
		int k=max(i,j);
		System.out.println("the maximum value is :"+k +"and "+i+ "and "+j);
	}

}
