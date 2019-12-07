package TypeCasting;

public class LowerTypeCasting {

	
	public static void main(String[] args) {
		
		byte a=10;
		byte b=20;
		byte c;
		//c=a+b;//Compile Time Error: because a+b=20 will be int  
		
		c=(byte)(a+b);
		System.out.println(c);
		
		
		
		
		//Overflow  
		System.out.println("Overflow  \n ");
		
		int x=141;
		
		byte y=(byte)x;
		
		System.out.println(x);
		System.out.println(y);
		
		
		
		
		}
}







