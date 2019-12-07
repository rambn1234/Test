package Java8Feature_AnnonimousClassAnnonimousMethdLambdaExpression;

interface Interf
{
	public static void m1()
	{
		System.out.println(" Static Method Inside Interface");
	}
}



public class StaticMethodInsideInterface {
	
	
public static void main(String[] args) {
	
	System.out.println("Main Method........... JDK 8 Version Interface Contain Static Method.");
	
	Interf.m1();
	
	
}
}
