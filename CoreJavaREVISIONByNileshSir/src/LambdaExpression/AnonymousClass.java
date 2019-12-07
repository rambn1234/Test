package LambdaExpression;



interface  Transation1
{
	public void withdraw();
}




public class AnonymousClass {
public static void main(String[] args) {
		
Transation1 obj=new Transation1()
{
	public void withdraw()
	{
		System.out.println("Anonymous Inner class................");
	}
};


obj.withdraw();
     
   }
}


//1] Anonymous inner class -> A class declared without name is called anonymous inner class .
//2] Anonymous Method->A method Declared without name is called Anonymous method .
//3] Lambda Expression -> A Method declared without name is called Lambda Expression.