
public class DiffCharString {
	String name;
	public static void name(String myName){
		System.out.println("my name is :"+myName);
		
	}
	public static  String name1(String name){
	//	System.out.println("ghgjhjhj"+name);
		return "name"+name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArray={'s','r','e','e','n','u'};
		String str=new String(charArray);
	//	DiffCharString.name(str);
		name(str);
		System.out.println(name1(str));
	
		//System.out.println("my name is :"+str);
		//System.out.println("my name is :"+charArray.toString());
	//	System.out.println("my name is printed :"+str);

	}

}
