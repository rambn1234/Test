package Logical;


class Parent {

	public void show()
	{
		System.out.println("Parent Work");
	}
	
	
	public void work()
	{
		System.out.println("Parent Work");
	}
	
}

class Chield extends Parent
{
	
	
	
	public void show() {
		
		System.out.println(" parenet class method overriden into chield class............... ");
	}
	
	
	public void m2()
	{
		
		System.out.println("Chield M2");
	}
	
}


public class Test1
{
	public static void main(String[] args) {
	
		Parent p=new Chield();
		
		
		p.show();
		p.work();
		//p.m2(); //compile time error
		
		
		
	//	 Chield  c=new Parent();
		
		
	}
}