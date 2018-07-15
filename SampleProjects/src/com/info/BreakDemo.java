package com.info;

public class BreakDemo {
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOfInts={1,13,14,15,19};
		int searchFor=15;
		boolean foundIt=false;
		int i;
		for( i=0; i<arrayOfInts.length;i++){
			arrayOfInts[i]=searchFor;
			foundIt=true;
			//break;
		}
		if(foundIt){
			
			System.out.println("found the value "+searchFor+ "index "+i);
		}
		else{
			System.out.println(searchFor+"is not in the array element");
		}

	}

}
