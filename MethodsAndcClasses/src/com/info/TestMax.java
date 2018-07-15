package com.info;

public class TestMax {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=10;
		int valueMax=20;
		int maxValue=max(10,20);
		System.out.println("the max value is :"+maxValue);
		

	}

	private static int max(int i, int j) {
		// TODO Auto-generated method stub
		int result;
		if(i>j){
			result=i;
			
		}
		else{
			result=j;
		}
		return result;
	}

}
