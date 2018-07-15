
public class StrCopyValueOf {

	public static void main(String[] args) {
		 char[] Str1 = {'m','a','d','h','u'};
	      String Str2=null;
	      

	      Str2 = Str2.copyValueOf( Str1 );
	      System.out.println("Returned String " + Str2);

	      Str2 = Str2.copyValueOf( Str1, 0, 2 );
	      System.out.println("Returned String " + Str2);



		}
		
	}


