package StaticDemo;

public class StaticMethod {

	static int x;
	
	static void m1()
	{
		x=10;
		System.out.println("Static method "+x);
	}
	
	
	public static void main(String[] args) {
		
		m1(); // Static method call directly without object .
	}
	
	
}
