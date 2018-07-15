package com.info.madhu;

import java.util.ArrayList;

public class SwitchDemoFallThrough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList futuremonths=new ArrayList();
int month=3;
if(month==0){
	return;
}

switch(month){
case 1:
	futuremonths.add("january");
case 2:
	futuremonths.add("february");
case 3:
	futuremonths.add("march");
case 4:
	futuremonths.add("april");
case 5:
	futuremonths.add("may");
case 6:
	futuremonths.add("june");
	break;
	default:
		//System.out.println("invalid month");
		break;
}if(futuremonths.isEmpty()){
	System.out.println("invalid month");
}else{
for (Object monthname : futuremonths) {
	System.out.println("monthname :"+monthname);
	
}}
	}

}
