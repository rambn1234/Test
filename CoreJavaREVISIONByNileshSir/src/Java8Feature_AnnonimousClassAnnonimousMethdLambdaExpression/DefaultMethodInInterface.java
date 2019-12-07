package Java8Feature_AnnonimousClassAnnonimousMethdLambdaExpression;


interface InterfaceDefaultMethod
{
	 default void m1()
	{
		System.out.println(" Default Method in Interface........");
	}
	
	
	public void m2();
}

class Test implements InterfaceDefaultMethod

{
//	public void m1()
//	{
//		System.out.println(" Override Default Method.................");
//	}
	
	public void m2() {
		
		System.out.println("Its Abstarct Method ..........");
		
	}

}


public class DefaultMethodInInterface  {
	
	public static void main(String[] args) {
		
		Test t=new Test();
		t.m1();
		t.m2();
		
		
	}

}
// Abstract method compalsory to define in implimentation classess 
// but Default method is not compalsary to define in all implimentation classess
// IF Default method define in imlimentation class then overridon method use rather then interface in default method 
