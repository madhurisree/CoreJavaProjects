package com.info;

public class StaticVariable {
private String name;
private double sal;
public static final String DEPARTMENT="CODING";
StaticVariable(String ename){
	this.name=ename;
}
public double setSal(double esal){
	return this.sal=esal;
}
public static void empWife(){
	System.out.println("madhuri");

}
public void display(){
	System.out.println("emp name :"+name);
	System.out.println("emp salary " +sal);
	System.out.println("department is "+DEPARTMENT);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable sc=new StaticVariable("sreenu");
		sc.setSal(80000);
		sc.empWife();
		sc.display();
		

	}

}
