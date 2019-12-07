package StringPractice;

import java.util.Scanner;
public class ArrayDemo {
	static int ch;
	int size;
	static long sum;
	int array[]=new int[10];
	Scanner sc=new Scanner(System.in);
	
	void addData()
	{
		System.out.println("Add number Of Element in Array");
		size=sc.nextInt();
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Enter Element of array["+i+"]=");
			array[i]=sc.nextInt();
		}
	}
	
	void displayData(int array1[])
			{
				for(int i=0;i<array1.length;i++)
				{
					System.out.println("array["+i+"=]"+array1[i]);
				}
			}
	
	
	void AdditionOfData(int array1[])
	{
		for(int i=0;i<array1.length;i++)
		{
			System.out.println("array["+i+"=]"+array1[i]);
			sum=sum+array1[i];
		}
		
		System.out.println(" Total sum of Array is="+sum);
		
	}
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayDemo ob=new ArrayDemo();

		ob.addData();

		ob.displayData(ob.array);
	
		ob.AdditionOfData(ob.array);
	}	

	
}
