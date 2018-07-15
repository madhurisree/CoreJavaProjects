package com.info;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner s= new Scanner(System.in);
		System.out.println("enter month name");
*//*int month=s.nextInt();
switch(month){
case 1:
	System.out.println("january");
	break;
case 2:
	System.out.println("feb");
	break;
case 3:
	System.out.println("mar");
	break;
	default:
		System.out.println("you are not entering correct month");
}
*/	
	/*String name=s.next();
	switch(name){
	case "sreenu":
		System.out.println("sreenu loves to madhuri");
		break;
	case "madhuri":
	System.out.println("madhuri loves to sreenu");
	break;
	default:
		System.out.println("but now they are not talking each otherd");
	}
	*/
		
	ArrayList futureMonths= new ArrayList();
	Scanner s=new Scanner(System.in);
	System.out.println("enter month number");
	int month =s.nextInt();
	switch(month){
	case 1:
		futureMonths.add("january");
		break;
	case 2:
		futureMonths.add("february");
		break;
	case 3:
		futureMonths.add("March");
		break;
	case 4:
		futureMonths.add("April");
		break;
		default:
			System.out.println(",,,,.....,,,,");
			break;
		
	}
	if(futureMonths.isEmpty()){
		System.out.println("enter any other number");
	}else{
		for(Object number:futureMonths ){
			System.out.println(number);
		}
	}
	
	}

}
