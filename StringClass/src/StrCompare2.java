
public class StrCompare2 {
	private String name;
	private String name2;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	//boolean b;
	public static boolean comp(String name, String name2){
		if(name.equalsIgnoreCase(name2)){
			System.out.println("its true");
			return true;
		}else{
			System.out.println("its false");
			return false;
		}
	}
	public static void main(String[] args) {
		StrCompare2 st=new StrCompare2();
		st.setName("Madhu");
		st.setName2("madhu");
	String s=	st.getName();
	String s1=	st.getName2();
		st.comp(s, s1);
			}

}
