package Java8Feature_AnnonimousClassAnnonimousMethdLambdaExpression;

interface Transantion
{
	public void withdraw(int amt);
}


//class Withdraw1 implements Transation
//{
//
//	public void withdraw(int amt) {
//		System.out.println("Amount ="+amt);
//		
//	}
//	
//}


public class AnnonimousInnerClass {

	
	public static void main(String[] args) {
		
		Transantion obj=new Transantion()      // Anonymous InnerClass
		{

			public void withdraw(int amt) {
				System.out.println("Amount ="+amt);
				
			}
			
		};
		
		obj.withdraw(1000);
		
	}
	
	
}
