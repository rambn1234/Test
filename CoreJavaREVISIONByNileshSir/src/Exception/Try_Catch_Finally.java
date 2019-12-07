package Exception;

public class Try_Catch_Finally {
	
	public static void main(String[] args) {
		
		
		try {
			
			System.out.println("Try Block.............");
			int x=10/0;
			System.out.println(" try ..........End");// try block in Exception Generated bellow code is not executed..............
		} catch (Exception e) {
			System.out.println("Catch block");
		}	
		finally {
			
			System.out.println("Finally block exicuted ................");
		}
		
		
		
		System.out.println(" Exicute Program Successfully........................");
	}
}
