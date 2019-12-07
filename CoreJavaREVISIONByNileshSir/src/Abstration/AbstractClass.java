package Abstration;


abstract class Account
{
	
	abstract public void m1();         //     
	abstract protected void m3();    // public and protected, abstract method 
	                                // private , default not abstract method . 
	
	
//Not Allowed	//  final static abstract protected void m4(); //The abstract method m4 in type Account can only set a visibility modifier, one of public or protected
	
 private void m2()                                      
 {
	 System.out.println(" M2 Private method in Abstract class");
 }
 
}

public class AbstractClass extends Account {

	
	public void m1() {
	 
System.out.println("M1 Abstract method Public ................");
		
	}

	@Override
	protected void m3() {
		System.out.println(" m3 Abstract method protected");	
		
	}
	
}
