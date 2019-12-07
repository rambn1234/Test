package Abstraction;


 abstract class A
{
	 
	 
	 void m1()
	 {
		 System.out.println("M1 Non Abstract Method.........");
	 }
	 
	 
	abstract void m();

}


 class B extends A
{
	 void m()
	 {
		 System.out.println("Abstract method..............");
		 
	 }
}

 
 
 class C extends B
 {
	 
	 void m() {
		 System.out.println("M3 Method Of C Class");
	 }
	 
	 
 }


public class AdstractClasss {

	public static void main(String[] args) {
	
		
		
		
		A a=new B();
		a.m1();
		a.m();
		
		
		
	
		C c=new C();
		c.m();
		c.m1();
		c.m();
		
		
		
	}
	
}
