package OOP;

public class MethodOverloading {

	public void m1()
	{
		System.out.println(" M1 method..............");
	}
	
	private void m1(int a)
	{
		System.out.println(" M1 method of int argument.............."+a);
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Main Method............");
		
		MethodOverloading ob1=new MethodOverloading();
		ob1.m1();
		ob1.m1(100);
		
	}
}
