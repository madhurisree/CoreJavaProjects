
public class StrContentEq {
	//String s;
	//StringBuffer s1;
	public static boolean  check(String s, StringBuffer s1 ){
		if(s.contentEquals(s1)){
			System.out.println("its true :"+s1);
		}
		else{
			System.out.println("its false :"+s);
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="the string is an immutable";
String str2="the string class is final";
StringBuffer sb=new StringBuffer("the string is an immutable");
//boolean result =str.contentEquals(sb);
//System.out.println(result);
//result =str2.contentEquals(sb);
//System.out.println(result);
StrContentEq.check(str, sb);
check(str2,sb);


	}

}
