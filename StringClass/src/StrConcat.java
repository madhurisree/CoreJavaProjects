
public class StrConcat {
	String name;
public String conCat(String name){
	System.out.println("my name and my dear name is :"+name);
		return name;
	}
	public static void conCat1(String name){
		System.out.println("my name is "+name);
		
	}
	public static void main(String[] args) {
		String str="Sreenu";
	String	str1=str.concat("madhuri");
	//	String str1=new String(str);
		StrConcat str2=new StrConcat();
		str2.conCat(str1);
		conCat1(str);
		
	}

}
