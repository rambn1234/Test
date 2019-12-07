package Exception;
                        
public class ExceptionInTry_FinnallyReturnStatement {

	int a=100;
	public int M()
	{
		try {
			System.out.println("Try Block Exicuted 2");
		int x=a/0;
		                 // when try block generate exception Control goto  finally block . finally block return statement and Controller 
		                 //goto calling method with return value  and control not come back to try_Block to Print Exception  on Console even exception Is Generated  
		return a;
		
		} finally {
		
			System.out.println("Finally Block Exicutes 3");
			a=200;
			return a;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main Method Exicuted 1");
		
		ExceptionInTry_FinnallyReturnStatement ob=new ExceptionInTry_FinnallyReturnStatement();
		
		int x=ob.M();
		System.out.println(x);
		System.out.println("Main End");
		
	}
}
