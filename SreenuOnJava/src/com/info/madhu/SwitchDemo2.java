package com.info.madhu;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 2;
		int year=2000;
		int numberofdays=0;
		switch(month){
		case 1: case 3: case 5: case 7: case 9: case 11:
			numberofdays=31;
			break;
		case 4: case 6: case 8: case 10: case 12:
			numberofdays=30;
			break;
		case 2:
			if((year%4==0 )&&!(year%100==0)||(year%400==0)){
				numberofdays=28;
			}
			else{
				numberofdays=29;
			}
			break;
			default :
				System.out.println("invalid month");
		}
		System.out.println("number of days :"+numberofdays);

	}

}
