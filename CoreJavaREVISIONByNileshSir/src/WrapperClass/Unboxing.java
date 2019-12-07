package WrapperClass;

public class Unboxing {

	
	public static void main(String[] args) {
		
		Integer i=new Integer(10);
		int no=i.intValue();
		
		int a=i.valueOf(i);// explicit conversion 
		
		
		int j=a;// implicit conversion.
		
		System.out.println(a);
		System.out.println(i);
		System.out.println(j);
		System.out.println(no);
	}
}
