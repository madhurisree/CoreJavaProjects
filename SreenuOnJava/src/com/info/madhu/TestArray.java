package com.info.madhu;

public class TestArray {

	public static void main(String[] args) {
int[] intArray={7,8,11,5,11};
for (int i = 0; i < intArray.length; i++) {
	System.out.println("array values :"+intArray[i]);
	
}
int sub=0;
for (int i = 0; i < intArray.length; i++) {
	sub+=intArray[i];
}System.out.println("sub value :"+sub);
int max=intArray[0];
for (int i = 0; i < intArray.length; i++) {
	if(intArray[i]>max){
		max=intArray[i];
	}
}	System.out.println("minimum value :"+max);


	}

}
