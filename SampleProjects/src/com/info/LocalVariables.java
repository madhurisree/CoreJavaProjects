package com.info;

public class LocalVariables {
	public void calc(){
		 int sum=0;//local variables must be intialized and after exit the method
		 //we cant access the local variables and declared inside the method block and constructor
		 //it doesnt allow the avvess modifier like public etc.
		 sum=sum+17;
		 System.out.println("the total valule is :"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalVariables l=new LocalVariables();
l.calc();
	}

}
