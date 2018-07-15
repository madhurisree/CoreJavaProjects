package com.info1;

public class Employee {
	int id;
	String name;
	String city;
	Employee(int id, String name){
		this.id=id;
		this.name=name;
		
	}
	Employee(int id, String name,String city){
		this(id,name);//now no need to use intialize id and name reuse the constructor in the constructor
		this.city=city;
	}//this is called chain constructor
	//this()keyword must be should be in first statement
	public void display(){
		System.out.println(id +"::"+ name +"::"+ city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(101,"sreenumadhuri","kadapa");
		Employee e1= new Employee(102,"SreeMadhuri","Hindhupuram");
e.display();
e1.display();
	}

}
