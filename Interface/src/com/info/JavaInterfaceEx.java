package com.info;

public class JavaInterfaceEx implements IntEx {
//here one interface extends multiple interfaces and one class extends one class only but implement multiple interfaces
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("welcome to interface");
	}
public static void main(String[] args) {
	IntEx i=new JavaInterfaceEx();//Interface does not allow the object creation by the programmer by using new keyword and new operator
System.out.println(i.i);
i.sayHello();
}
}
