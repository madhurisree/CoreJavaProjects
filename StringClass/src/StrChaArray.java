
public class StrChaArray {
	public static void main(String[] args) {
		String str=new String("This is a String Handling Tutorial");
		char[] array= new char[6];
		try {
			str.getChars(10, 16, array, 0);
			System.out.println("coppied value");
			for (char c : array) {
				System.out.println("char list :"+c);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	      String Str1 = new String("Welcome to www.dineshonjava.com");
	      char[] Str2 = new char[8];

	      try{
	         Str1.getChars(2, 10, Str2, 0);
	         System.out.print("Copied Value = " );
	         for (char c : Str2) {
	        	 
	        	 System.out.println(c );	
			}
	         

	      }catch( Exception ex){
	         System.out.println("Raised exception...");
	      }

		
	}
}
