package com.info.madhu;

import java.util.Scanner;

public class StringSwitchDemo {
	public static int getMonthNumber(String month){
		int  monthNumber=0;
		if(month==null){
			return monthNumber;
		}
		switch(month.toLowerCase()){
		case "january":
			monthNumber=1;
			break;
		case "february":
			monthNumber=2;
			break;
		case "march":
			monthNumber=3;
			break;
			default:
				monthNumber=0;
			
		}
		return monthNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter Month name :");
		String month=s.next();
		int returnMonthNumber=StringSwitchDemo.getMonthNumber(month);
		//System.out.println(returnMonthNumber);

if(returnMonthNumber==0){
	System.out.println("invalid month");
}else{
System.out.println("valid month number :"+returnMonthNumber);

	}

	}}
