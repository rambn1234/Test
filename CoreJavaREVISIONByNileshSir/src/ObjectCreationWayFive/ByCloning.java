package ObjectCreationWayFive;
public class ByCloning implements Cloneable{

	int x=100;
	ByCloning()
	{
		System.out.println(" Default constructor");
	}
	
	void m1()
	{
		System.out.println(" M1 method ");
		System.out.println("obj call method X="+x);
	}
	void m2()
	{
		System.out.println("m2 method ");
		System.out.println("obj2 call method X="+x);
	}
//	protected Object clone() throws CloneNotSupportedException
//	{
//		return (ByCloning)super.clone(); // override 
//		
//	}
	public static void main(String[] args) throws CloneNotSupportedException {
	
		System.out.println(" Main Method ....................");
		
		
		ByCloning obj=new ByCloning();
		obj.m1();
		
		ByCloning  obj2=(ByCloning)obj.clone();
		obj2.x=200;
		obj2.m2();
		
		
		obj.m1();  
	}
}



// 1} One object not  effect to  another object (clone created object)


//BY Assignment Operator
//One object effect to  another object
//Q. Why create object by Cloning?
//ans Using Assignment Operator to create copy of reference variable
//In Java, there is no operator to create copy of an object. Unlike C++, in Java, if we use assignment operator then it will create a copy of reference variable and not the object. This can be explained by taking an example. Following program demonstrates the same.