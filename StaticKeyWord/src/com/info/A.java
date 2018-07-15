package com.info;

public class A {
	//Can we execute a program without main() method?
//— Yes, one of the way is static block but in previous version of JDK not in JDK 1.7.

//it is not execute because I used jdk 1.8
static{
	System.out.println("welcome");
	System.exit(0);
}
}
