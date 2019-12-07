package LambdaExpression;


	
	interface Transation
	{
		public void withdraw();
	}
	
	class Amount implements Transation
	{

		@Override
		public void withdraw() {
		System.out.println("Wothdra Method........................");
			
		}
		
	}
	
	public class TestWithoutLambdaExpression {
		
	public static void main(String[] args) {
		
		Amount obj=new Amount(); 
		obj.withdraw();
		
	}
	
}
