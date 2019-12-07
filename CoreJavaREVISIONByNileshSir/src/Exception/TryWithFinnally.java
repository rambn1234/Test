package Exception;



public class TryWithFinnally {

public static void main(String[] args) {
	
	
	
	try {
		int x=10/0;
		
	} finally {
		System.out.println("Finally block Exicuted....................");
	}
	
	System.out.println("Program Exicuted Successfully...................");
	
	
	
	
}
}