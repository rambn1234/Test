package Exception;

import java.io.ObjectInputStream.GetField;

class MyException extends Exception
{
MyException(String s)	
{
	super(s);
}	
}

public class CustomeExceptionThrow {
	 static int currentbalanc=0;
	
	public static void main(String[] args) {
		
		int x;
		try {
			//x=10/0;
			  if(currentbalanc<1)
			  {
			         throw new MyException("ram genrated exception insufficient Ballance to withdraw amount "); // its unchecked exception not compulsory to use throws and try-catch to handle and Unchacked exception
			  }
			} catch (MyException e) {
			
			System.out.println(e);
	        e.printStackTrace();
	       
			
		}

//	Thread t =Thread.currentThread();
//		for(int i=1;i<10;i++)
//		{
//			try {
//				t.wait();               //checked Exception so try-catch or throws keyword compulsory to handle Unchecked exception 
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
		System.out.println(" Custome Genrated Exception Handle successfully..................");
	}

}
