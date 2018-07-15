package com.info.madhu;

public class LocalVariable {
	public void calc(int sum){
		sum=sum+10;
		System.out.println("sum of values :"+sum);
	}
	public static void main(String[] args) {
		LocalVariable l=new LocalVariable();
		l.calc(54);
		
	}

}
