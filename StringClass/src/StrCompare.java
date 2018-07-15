
public class StrCompare {
	private String name;
	private String name1;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getName1() {
		return name1;
	}


	public void setName1(String name1) {
		this.name1 = name1;
	}
	public void displayInfo(int i){
		System.out.println("the value of :"+i);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrCompare c=new StrCompare();
		c.setName("sreenu");
		c.setName1("sreenu madhuri");
		String s=c.getName();
		System.out.println(s);
		String s1=c.getName1();
		System.out.println(s1);
		c.setName1("madhu");
		String s3=c.getName1();
		System.out.println(s3);
		
	//	int i=s.compareTo(s1);
		int i=s.compareTo(s3);
	//	i=s1.compareTo(s);
		
		c.displayInfo(i);

	}

}
