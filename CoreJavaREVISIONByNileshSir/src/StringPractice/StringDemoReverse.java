package StringPractice;

import java.util.Scanner;

public class StringDemoReverse {
	static String reverse="";
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter String ");
		String orignal=sc.nextLine();
		
		
		for(int i=orignal.length()-1;i>=0;i--)
		{
			reverse = reverse + orignal.charAt(i);
		}
		
		System.out.println(reverse);
		
	}
	
}
