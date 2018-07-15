package com.info.madhu;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=1;
		String monthstring =null;
		if(month==0){
			return;
		}
		switch(month){
		case 1: 
			monthstring="January";
			break;
		case 2:
			monthstring="February";
			break;
		case 3:
			monthstring="march";
			break;
		case 4:
			monthstring="april";
			break;
			default:
				System.out.println("invalid month");
			
			
		}
		System.out.println(monthstring);

	}
	//System.out.println(monthstring);


}
