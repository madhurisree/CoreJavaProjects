package com.info;

public class InstanceTest {
	private String name;
	private double sal;
	InstanceTest(String empname){
		name=empname;
	}
	public double setSal(double sal){
		return this.sal=sal;
	}
	public void empSal(){
		System.out.println("emp name :"+name);
		System.out.println("emp sal :"+sal);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InstanceTest test=new InstanceTest("sreenumadhuri");
test.setSal(80000);
test.empSal();
	}

}
