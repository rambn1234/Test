package Java8Feature_AnnonimousClassAnnonimousMethdLambdaExpression;



interface TransationDemo
{
	public void withdraw(int amt);
}
  

public class LambdaExpression {
public static void main(String[] args) {
	
	
	TransationDemo obj=(int amt)->
			{
		       System.out.println(" Amount ="+amt);
			};
	
	obj.withdraw(1099);
}
}
