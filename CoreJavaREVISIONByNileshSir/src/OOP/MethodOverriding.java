package OOP;

class A
{
	
	public int m1()
	{
		System.out.println("M1 method of A class....................");
		return 10;
	}
}


 class B extends A
{
	public int m1()
	{
		System.out.println( "M1 method of B class");
		return 100;
	}
	
}


public class MethodOverriding {

	public static void main(String[] args) {
		
		B b=new B();
		int x=b.m1();
		System.out.println(x);
		
		
	}
	
	
}
