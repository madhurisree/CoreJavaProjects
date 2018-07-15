package com.info;

import java.util.Scanner;

public class StringSwitch {
public static int getMonthNumber(String month){
	int monthNumber=0;
	if(month==null){
		System.out.println("munth not null");
		
		return monthNumber;
	}
	switch(month){
	case "january":
		monthNumber=1;
		break;
	case "february":
		monthNumber=2;
	break;
	case "march":
		monthNumber=3;
		break;
	case "april":
		monthNumber=4;
		break;
	case "May":
		monthNumber=5;
		break;
		default :
			System.out.println("intvalid month ");
	}
	return monthNumber;
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter Month name :");
	String month=s.next();
	int returnMonthNumber=StringSwitch.getMonthNumber(month);
	System.out.println(returnMonthNumber);
}
}
