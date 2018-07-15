package com.info.madhu;

public class InstanceVariable {
	public String name;//this instance variable is visible for any child class
	private double salary;//salary variable is visible only in instance variable class only
	//the name variable is assigned to the constructor
	public InstanceVariable(String name){
		this.name=name;
	}
	//the salary variable is assigned to a method
	public void empSalary(double salary){
		this.salary=salary;
	}
	//this method prints the employee details
	public void displayInfo(){
		System.out.println("employee name :"+name);
		System.out.println("employee salary :"+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable in=new InstanceVariable("sreenumadhuri");
		in.empSalary(80000);
		in.displayInfo();

	}

}
