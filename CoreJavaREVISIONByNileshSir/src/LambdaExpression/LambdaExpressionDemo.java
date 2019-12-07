package LambdaExpression;



interface Transation2
{
	public void withdraw();
	
}

public class LambdaExpressionDemo {

	
	public static void main(String[] args) {
		
		Transation2 obj = ()->{
			
			System.out.println(" LAMBDA EXPRESSION Demo................ ");
		};
		
		obj.withdraw(); 
	}  
	
}
