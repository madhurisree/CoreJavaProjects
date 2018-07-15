package com.info.inher;

public class A {
public	int a;
public	int b;
public	int c;

	protected A(int p, int q, int r) {
		a = p;
		b = q;
		c = r;

	}

	protected void show() {
System.out.println("call from sub class values :"+a);
	}
}
