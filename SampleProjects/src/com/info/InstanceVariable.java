package com.info;

public class InstanceVariable {
	public static final String ADDRESS="address  print the perticular employee";
	public String name;//this instance variable visible for any child class
	private double salary;//salary variable can visible in emp class only
	//the name variable assigned to the constructor
	InstanceVariable(String ename){
		name=ename;
	}
	//the salary variable assigned to a value
	public void setSalary(double esalary){
		salary=esalary;
	}
	//this method print then emp salary and emp name
	public void display(){
		System.out.println("the employee name :"+name);
		System.out.println("the employee salary :"+salary);
		System.out.println(ADDRESS);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable in=new InstanceVariable("sreenuMadhuri");
		in.setSalary(80000);
		in.display();

	}

}
