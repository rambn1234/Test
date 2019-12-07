package WrapperClass;

public class AutoBoxing {

	
	public static void main(String[] args) {
		
		int a=10;
		
		Integer i=Integer.valueOf(a);//explicitly conversion.
		
		Integer obj=a; // 5.0 onward implicit conversion 
		
		
		System.out.println(a);
		System.out.println(i);
		System.out.println(obj);
		
	}
	
	
}
