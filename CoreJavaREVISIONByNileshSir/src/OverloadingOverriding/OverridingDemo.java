package OverloadingOverriding;





class ParentClass
{
	
	public int id;
	public String name;

	
      int m1()
	{
		System.out.println("Parent class m1");
		return id;
	}
	
}

class ChieldClass extends ParentClass
{
	
	  int m1()
	{
		System.out.println("Chield class overrided m1");
		
		id=10;
		return id;
		
		
	}
}


public class OverridingDemo {
	
	
	
public static void main(String[] args) {
	
	
	
	
	ChieldClass obj=new ChieldClass();
	
	int x=obj.m1();
	System.out.println(x);
	
	
}
}
