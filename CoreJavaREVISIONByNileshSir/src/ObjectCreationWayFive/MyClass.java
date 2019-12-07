package ObjectCreationWayFive;

public class MyClass {
	int x;
	void m1()
	{
		x=100;
		System.out.println("m1 method x="+x);
	}
	
	public static void main(String[] args) {
		
		// create Object by class Loader
		try {
			
			
			MyClass obj1=(MyClass)MyClass.class.getClassLoader().loadClass("ObjectCreationWayFive.MyClass").newInstance();
			
			obj1.m1();
		
		 } catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
} 
