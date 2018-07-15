package com.info.madhu;

public class LocalVariableError {
	public void calc(){
		int sum=0;//here we are not intializing the values that time we will get an error that is local variable
		sum=sum+10;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		LocalVariableError le=new LocalVariableError();
		le.calc();
	}

}
