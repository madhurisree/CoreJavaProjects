package com.info;

public class ReverseString {
	/*public static String reverse(String source){
		if (source==null || source.isEmpty()) {
			return source;
			
		  
		}
		String reverse1="";
		for (int i = source.length()-1; i >=0; i--) {
			reverse1= reverse1+source.charAt(i);
			
		}
		return reverse1;
		
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sreenu on java";
		String reverse= new StringBuffer(str).reverse().toString();
		System.out.printf("original string :%s, reversed string %s %n",str,reverse);

	}

}
