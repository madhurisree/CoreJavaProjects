package com.info;

public class Shepard {
	int age1,age2;
	String name1,name2;
	
	public Shepard(String name1, String name2){
		this.name1=name1;
		this.name2=name2;
		
		//System.out.println("name is :"+name1);
		//System.out.println("name is :"+name2);
	}
	public void setAge(int age1, int age2){
		this.age1=age1;
		this.age2=age2;
	}
	public int getAge(){
		return age1+age2;
	}
	public  void displayInfo(){
		System.out.println("my name is :"+ name1 +" and my age is :"+ age1+ " my lover name is :"+name2 +" and her age is :"+age2);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shepard s=new Shepard("sreenu","madhuri");
		s.setAge(25,24);
		s.displayInfo();
		
		

	}

}
