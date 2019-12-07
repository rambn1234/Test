package Java8Feature_AnnonimousClassAnnonimousMethdLambdaExpression;

interface Transation
{
	public void withdraw(int amt);
}

class Withdraw implements Transation
{

	
	public void withdraw(int amt) {
		System.out.println("amount="+amt);
		
	}
	
}


public class SimpleDemo {

	public static void main(String[] args) {
		
		
		
		Withdraw obj=new Withdraw();
		obj.withdraw(100);
		
		
	}
}
