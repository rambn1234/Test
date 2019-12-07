package ConstructorType;

public class ParamiterisedConstructor {

	
	int salary;
	String name;
	ParamiterisedConstructor(int salary,String name)
	{
		this.salary=salary;
		this.name=name;
		
	}
	
	void display()
	{
	
		System.out.println("Salary="+salary);
		System.out.println("Employee="+name);
	}
	
	
	
	
	public static void main(String[] args) {
		ParamiterisedConstructor ob1=new ParamiterisedConstructor(100000,"Ram");
		ParamiterisedConstructor ob2=new ParamiterisedConstructor(200000,"Ramesh");	
		ob1.display();
		ob2.display();
		
		System.out.println(" Main Method................");
	}
	
	
}
