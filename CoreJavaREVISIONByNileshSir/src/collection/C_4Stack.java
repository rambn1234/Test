package collection;

import java.util.Stack;

public class C_4Stack {

	
	
	public static void main(String[] args) {
		Stack s =new Stack();
		
		s.push(10);  // Add object into stack at top
	    s.push(20);
		s.push(50);
		s.push(100);
		System.out.println(s);//[10, 20, 50, 100]

		System.out.println(s.pop());//100     reatrive object at top and remove from stack
		System.out.println(s); //[10, 20, 50]   
		
		System.out.println(s.peek()); //50  retrive object top at the stack
		
		System.out.println(s.search(10));//3
		System.out.println(s.search(50));//1
		
		System.out.println(s.empty());//false
	}
	
}
