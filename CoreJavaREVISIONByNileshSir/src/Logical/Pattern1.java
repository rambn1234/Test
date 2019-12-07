package Logical;

public class Pattern1 {
	
	
public static void main(String[] args) {

	for(int i=0;i<5;i++)
	{
		
		if(i==0)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print("***");
			
			}
		}
	
	}
	System.out.println();
	for(int i=0;i<5;i++)
	{	
		
		if(i==2)
		{
			for(int k=1;k<=5;k++) {
				
				System.out.print("*");
			}
		}
		
		
		
		System.out.println("*    *");
	}
	
}	
}
