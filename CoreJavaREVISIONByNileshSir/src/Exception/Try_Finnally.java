package Exception;
class Test
{
	int a=5;
	public int m1()
	{
		
		try {
			System.out.println("Try block...........");
			return a;
			
		} finally {
			
			System.out.println("Finnally Block.exicuted ");
			
		}
	}
}

public class Try_Finnally {
	
public static void main(String[] args) {
	Test t=new Test();
int x=t.m1();
System.out.println(x);
}
}
