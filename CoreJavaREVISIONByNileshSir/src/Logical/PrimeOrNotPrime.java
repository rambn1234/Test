package Logical;

import java.util.Scanner;

public class PrimeOrNotPrime {

	public static void main(String[] args) {
	    boolean flag=false;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Input Number");
		
		int num=sc.nextInt();
		
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
			}	
		}
		
		if(flag)
		{
			System.out.println("Given Number Is Not Prime="+num);
		}
		else
		{
			System.out.println("Given Number Is Prime="+num);
		}	
	}	
}
