package com.info;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setName("Sreenu madhuri");

		p.setAge("24.5 years");
		p.setColor("fair red");
		p.setHeight(5.8);
		p.setWeight(50);
	String s=	p.getName();
	System.out.println(s);
	String s1=p.getAge();
	System.out.println(s1);
	String s2=p.getColor();
	System.out.println(s2);
	double s3=p.getHeight();
	System.out.println(s3);
	double s4=p.getWeight();
	System.out.println(s4);
	

	}

}
