package ConstructorSynarious;




class A
{
	A()
	{
		System.out.println("A Constructor.............");
	}
	
}

public class B extends A{
	 B ()
	 {
		 
			super();
		 System.out.println("B Constructor");
		 
	
	 }
	 
	 
	 
	 public static void main(String[] args) {
		 
		 
		 System.out.println("Main Method ...........");
		B b=new B();
		
		
		

		
	}
}




