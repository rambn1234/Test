package Demo;

public class VariableDemo {

	
	int x=10;
	
	
	void display()
	{
		System.out.println(x);
	}
	
	
	public static void main(String[] args) {
		
		
		
		VariableDemo ob=new VariableDemo();
		System.out.println(ob.x);
		ob.display();
	}

}
