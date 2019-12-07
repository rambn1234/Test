package OverloadingOverriding;




class Overloading
{
	private int id;
	private String name;
	private String address;
	
	
	public final int m1(int id )
	{	
		System.out.println("Id="+id);
		
		return id;
	}
	
	
	public final String m1(String name )     // Overloaded method return type can be change .
	{	
		System.out.println("name="+name);
		
		return name;
	}
	
	
	
}

public class OverloadingDemo {
	
	public static void main(String[] args) {
		Overloading obj1=new Overloading();
		int x=obj1.m1(10);
		System.out.println("Main method id="+x);
		
		
		String name1=obj1.m1("Ram");
		System.out.println("Main method name="+name1);
	}
	
	

}
