package com.info;

public class ConsOverLoading {
private String name;
public ConsOverLoading() {
	// TODO Auto-generated constructor stub
	System.out.println("constructor object is created");
}
public ConsOverLoading(String t){
	name=t;
}
public static void main(String[] args) {
	ConsOverLoading c=new ConsOverLoading();
	ConsOverLoading s=new ConsOverLoading("java");
	c.setName("c++");
	s.getName();
	
	
	c.getName();
}

private void getName() {
	// TODO Auto-generated method stub
	System.out.println("language name is :"+name);
}
private void setName(String string) {
	// TODO Auto-generated method stub
	name=string;
}

}
