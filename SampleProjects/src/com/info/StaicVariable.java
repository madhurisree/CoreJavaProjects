package com.info;

public class StaicVariable {
	private static double salary;
	static{
		salary=70000;
	}
	public static final String DEPARTMENT="CODING";
	/**
	 * 
	 */
	public static void display(){
		System.out.println("the salary is :"+salary);
		System.out.println("the department is: "+DEPARTMENT);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaicVariable.display();
		int a,b,c;
		int d=3,e,f=5;
		byte z=33;
		double pi=3.14159;
		char x='x';
		String s="sreenu";
		
		

	}

}
