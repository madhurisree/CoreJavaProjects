package com.info;

public class Switch3 {
	public static void main(String[] args) {
		int year=2000;
		int month=2;
		int days=0;
		switch(month){
		case 1: case 3:
		case 5:
		case 7:
		case 9:
		case 11:
			days=31;
			break;
		case 4: case 6: case 8: case 10: case 12:
			days=30;
				break;
		case 2:
			if((year%4==0)&&!(year%100==0)||(year%400==0)){
				days=29;
			}
			else{
				days=28;
			}
			break;
			default:
				System.out.println("invalid month");
		}
		System.out.println("number of days"+days);
		
			
		}
		
	
}
