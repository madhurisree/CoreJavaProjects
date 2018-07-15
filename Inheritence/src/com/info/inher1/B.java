package com.info.inher1;

import com.info.inher.A;

public class B extends A {
public int d;
public int e;
	 B(int l, int m, int n, int o, int e) {
		super(l, m, n);
		// TODO Auto-generated constructor stub
		d=o;
		super.a=e;
		super.show();
	}
	
	 protected void show(){
		System.out.println("A value :"+a);
		System.out.println("B value :"+b);
		System.out.println("C value :"+c);
		System.out.println("D value :"+d);
	}
	

}
