package ObjectCreationWayFive;

public class Reflection {

	
	
	 Reflection ()
	 {
		 System.out.println(" Default constructor......................");
	 }
	 
	 void m1()
	 {
		 System.out.println(" M1 method............");
	 }
	 
	 
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		Reflection obj=new Reflection();
		
		
		Reflection obj2=(Reflection)Class.forName("ObjectCreationWayFive.Reflection").newInstance();
		System.out.println(" M1 method call by Obj2 object ");
		
		obj2.m1();
	}
}


// create object by Reflection way 
//Class is a class Name of Java.lang Packeg .    forName is a static method and pass package name dot class name 
//.newInstance() method create new instance of dynamically allocated class and return type is any object type.

