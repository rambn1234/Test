package JavaVariable;

public class VariableInJava {

	int X=10;
	
	static int Z=30;
	
	void m1()
	{
		int y=20;
		
		System.out.println(" LocalVariable=Y:"+y);
		
	}
	
	

	public static void main(String[] args) {
		VariableInJava ob1=new VariableInJava();
		
		
		ob1.m1();
		
		System.out.println(" instance Variable X:"+ob1.X);
		
		System.out.println("Static Variable Z:"+ob1. Z);
		
	}
}
