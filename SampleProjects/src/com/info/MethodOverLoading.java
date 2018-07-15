package com.info;

public class MethodOverLoading {
	public static int average(int i,int j, int k){
		int average=(int) ((i+j+k)/3.0);
		return average;
	}
public  static double average(double x,double y, double z){
	return (x+y+z)/3;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("average is "+average(8,101 , 11) );
		System.out.printf("average is %5.3f",average(5.2, 6.3, 8.5));

	}

}
