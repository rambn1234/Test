package Logical;
import java.util.Scanner;
public class CharecterCountInGivenString {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		
		System.out.println("Given String ="+s);
		
        char ch[]=new char[s.length()];
		
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
		}
		for(int i=0;i<ch.length;i++)
		{
			
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			System.out.println("Given String Charector Occurance="+ch[i]+"="+count);
		}	
	}
}
