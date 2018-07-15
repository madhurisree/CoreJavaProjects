package com.info;

import java.util.ArrayList;
import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList futureMonths=new ArrayList();
		Scanner s=new Scanner(System.in);
		System.out.println("enter month: ");
	int month=s.nextInt();
	switch(month){
	case 1:futureMonths.add("january");
	case 2:futureMonths.add("february");
	case 3:futureMonths.add("MARCH");
	case 4:futureMonths.add("April");
	break;
	default:
		break;
	}
	if(futureMonths.isEmpty()){
		System.out.println("enter different number");
	}else{
		for (Object object : futureMonths) {
			System.out.println(object);
			
		}
	}

	}

}
