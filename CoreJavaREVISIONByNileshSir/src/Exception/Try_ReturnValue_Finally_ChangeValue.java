package Exception;

public class Try_ReturnValue_Finally_ChangeValue {

	int a=10;
	
	public int m() 
	{
		try {
			System.out.println("Try Start");
			return a;
			
		} finally {
		   
			a=30;
			System.out.println("Finally End................");
			
		}
	}

	public static void main(String[] args) {
		System.out.println("Main Method...................");
		Try_ReturnValue_Finally_ChangeValue ob=new Try_ReturnValue_Finally_ChangeValue();
		 int x=ob.m();
		
		System.out.println(x);
	}
}
