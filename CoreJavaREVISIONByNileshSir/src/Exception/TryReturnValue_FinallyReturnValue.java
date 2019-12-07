package Exception;

public class TryReturnValue_FinallyReturnValue {

	int a=100;
	public int M()
	{
		try {
			System.out.println("Try Start");
			return a;
			
		} finally {
		
			System.out.println("Finally change value of a");
			a=200;
			return a;     
		}
	}                       
	         // alwase finally Return Value
	

	
	public static void main(String[] args) {
		
		TryReturnValue_FinallyReturnValue  ob=new TryReturnValue_FinallyReturnValue ();
		System.out.println("Main Method...................");
		int x=ob.M();
		System.out.println(x);
		
	}
}
